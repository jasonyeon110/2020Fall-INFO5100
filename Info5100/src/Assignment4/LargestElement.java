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
			//System.out.println("Printing out Dup removed array");
			System.out.println(arr_new);
			return arr_new;
		}
	
	//Actual code for the first problem
	public static int kthElement(int k, int[] arr) {
		int[] a = arr;
		Arrays.sort(a);
		//System.out.println(a);
		int b = a.length;
		int i = b-k;
		System.out.println(k + "th Element in the Array is " + arr[i]);
		return arr[i];
	}

	/*sort an array in numeric order and find the kth element in the array
	 * So first I misunderstood the first problem. I thought we had to remove duplicated numbers and
	 * look for the kth's element and this is how I did it.
	 */
	public static int kthElementSortDupRemoved(int k, int[] arr) {
		int[] a = arr;
		Arrays.sort(a);
		int b = removeDups(a).size();
		int i = removeDups(a).get(b-k);
		
		
		System.out.println(k + "th Largest element in this Sorted & Removed duplicated array is " + i);
		
		return i;
	}

 
	
}
