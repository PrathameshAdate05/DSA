//https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selection(arr);
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp = select(arr,i);
            int temp1 = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp1;
        }

        System.out.println(Arrays.toString(arr));
    }

    static int select(int[] arr, int i){
        int samllest = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < arr[samllest])
                samllest = j;
        }
        return samllest;
    }
}
