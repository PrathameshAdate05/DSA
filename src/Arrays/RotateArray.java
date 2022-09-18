package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(arr,k);
    }

    static void rotate(int[] arr, int k){

        if (k > arr.length)
            return;

        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,k-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int left, int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
