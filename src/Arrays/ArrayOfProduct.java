package Arrays;

import java.util.Arrays;

public class ArrayOfProduct {
    public static void main(String[] args) {
        int[] arr = {8, 10, 2};
        System.out.println(Arrays.toString(product(arr)));
    }

    static int[] product(int[] arr){
        int[] res = new int[arr.length];
        int product = 1;

        for(int i : arr){
            product *= i;
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = product / arr[i];
        }

        return res;
    }
}
