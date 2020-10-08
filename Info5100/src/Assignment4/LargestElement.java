package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestElement {

	//find a duplicated number and put out the unique elements from the array.
	public static ArrayList<Integer> removeDups(int[] arr) {
		
		ArrayList <Integer> arr_new = new ArrayList<>();
		
		int i = 0;
			while (i < arr.length) {
				if (i == arr.length-1) {
					//System.out.println("Its the last digit");
					arr_new.add(arr[i]);
					break;
	
				} else if (arr[i] != arr[i+1]) {
					//System.out.println(arr[i] + " is Added to the New Array list");
					arr_new.add(arr[i]);
					i++;
				} else {
					//System.out.println("Elements are Same ==> Skip");
					i++;
				}
	
			}
			System.out.println("Printing out Dup removed array");
			System.out.println(arr_new);
			return arr_new;
		}
	

	//sort an array in numeric order and find the kth element in the array
	public static int kthElement(int k, int[] array) {
		int[] a = array;
		Arrays.sort(a);
		int b = removeDups(a).size();
		int i = removeDups(a).get(b-k);
		
		
		return i;
	}
	
	public static void main(String[] args) {
		int[] b = {1,4,5,6,7,3,2,4,6,7,8,9,9,8,7,6,5,4,3};
		System.out.println(kthElement(1,b));
		//removeDups(b);		

	}
}
