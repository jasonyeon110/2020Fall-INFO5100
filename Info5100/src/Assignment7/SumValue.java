package Assignment7;

import java.util.Random;

import jdk.nashorn.api.tree.ForInLoopTree;

public class SumValue extends Thread{
	
	/*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
		 
		 for (int i = 0; i < arr.length; i ++) {
			Random objRandom = new Random();
			arr[i] = (short) objRandom.nextInt(101);
			
			}
   	 }
	 
	 /*get sum of an array using 4 threads*/
	 static long sum(int[] arr){
		 int interval = arr.length/4;
		 
		 
		 SumArrayThread t1 = new SumArrayThread();
		 for (int i = 0; i < arr.length; i++) {
			t1.sumArray(arr[i]);
		}
		 
		 SumArrayThread t2 = new SumArrayThread();
		 for (int i = interval ; i < interval * 2; i++) {
			t2.sumArray(arr[i]);
		}
		 
		 SumArrayThread t3 = new SumArrayThread();
		 for (int i = interval * 2; i < interval * 3; i++) {
			t3.sumArray(arr[i]);
		}
		 
		 SumArrayThread t4 = new SumArrayThread();
		 for (int i = interval * 4; i < arr.length; i++) {
			t4.sumArray(arr[i]);
		}
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		 
		 try {
			 t1.join();
			 t2.join();
			 t3.join();
			 t4.join();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 return t1.sum + t2.sum + t3.sum + t4.sum;
		 
	 }
	 
	 public static class SumArrayThread extends Thread{
		 private long sum;
		 //Constructor that give sum zero at the start
		 SumArrayThread(){
			 this.sum = 0;
		 }
		 
		 //This sum Method will take arr[i] and add them
		 public void sumArray(int i) {
			 sum += i;
		 }	 
		 
		 public long sum() {
			 return sum;
		 }
		 
	 }
	 
	 
	 
	 
	 public static void main(String[] args){
	 int[] arr = new int[4000000];
	 generateRandomArray(arr);
	 long sum = sum(arr);
	 System.out.println("Sum: " + sum);
	 }
}

