package Assignment8;
/*Multithreading
Give a very large array of integers, find the maximum value within the array using multithreading.
*/

import java.util.Random;

public class MaxNumThread {

private static int maxNum = 0;
private static int[] arr;


/*generate array of random numbers*/
static int[] generateRandomArray(int[] arr){
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(1001);
    }
    return arr;
}

static int findMaxNum(int[] arr){
    int interval = arr.length/4;

    Thread t1 = new Thread(() -> {
        for (int i = 0; i < interval ; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
    });

    Thread t2 = new Thread(() -> {
        for (int i = interval; i < interval * 2 ; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
    });

    Thread t3 = new Thread(() -> {
        for (int i = interval * 2; i < interval * 3 ; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
    });

    Thread t4 = new Thread(() -> {
        for (int i = interval * 3; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
    });

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    } catch (Exception e){
        e.printStackTrace();
    }

    return maxNum;
}

public static void main(String[] args) {
    int[] arr = new int[4000000];
    arr = generateRandomArray(arr);
//    for (int i = 0; i < arr.length; i++) {
//        System.out.println(arr[i]);
//    }
    System.out.println("----------------");
    System.out.println("Maximum number is " + findMaxNum(arr));
}

}