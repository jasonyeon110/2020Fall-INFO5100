package Assignment_2;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public static int maxSubArray(int[] nums) {
        //write your code here
    	int leg = nums.length;
    
    	
    	int big = 0; //checking if numbers are big?
    	int fin = 0; //final print number
    	//int num = 0;
    	for (int i =0; i < leg; i ++) {
    		//big = big + nums[i];
    		//if (big < 0 ) {
    		//	big = 0;
    		//} else if (big > 0) {
    		//	big += nums[i];
    		//	big = fin;
    		//}
    		//num = num + nums[i];
    		big += nums[i]; // and num[i] to the big
    		//if (big > fin) {
    		//	fin = big; 
    		//}
    		if (fin < big) { //check if final is bigger than the big
    			fin = big;   //fin should be = to big
    		} //else {
    			//fin = big;
    		else if (big < 0) {  //if big is less than 0, like negative number
    			big = 0;  //make big = to 0 
    		} 
    	
    	}
		return fin;
   	
    }

    public static void main(String[] args) {
        //write your code here
    	int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println("Final maximum contiguous number is " + maxSubArray(nums));
    }
}