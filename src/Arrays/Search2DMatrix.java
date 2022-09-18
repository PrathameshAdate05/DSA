package Arrays;

import java.util.Arrays;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        System.out.println(search(matrix,target));
    }

    static boolean search(int[][] matrix, int target){
        for(int[] i : matrix){
            if (target >= i[0] && target <= i[i.length-1]){
                return binary(i,target);
            }
        }
        return false;
    }

    static boolean binary(int[] arr, int target){
        int start = 0, mid = 0, end = arr.length-1;

        while (start <= end){
            mid = (end + start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else
                return true;
        }

        return false;
    }
}
