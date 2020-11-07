package Assignment7;

import java.util.Random;

public class SumValue extends Thread{
	
	
	
	/*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
		 
		 for (int i = 0; i < arr.length; i ++) {
			Random objRandom = new Random();
			arr[i] = (short) objRandom.nextInt();
			
			}
   	 }
	 
	 /*get sum of an array using 4 threads*/
	 static long sum(int[] arr){
		 int interval = arr.length/4;
		 
		 Thread t1 = new Thread();
		 
	 }
	 
	 
	 public static void main(String[] args){
	 int[] arr = new int[4000000];
	 generateRandomArray(arr);
	 long sum = sum(arr);
	 System.out.println("Sum: " + sum);
	 }


}
