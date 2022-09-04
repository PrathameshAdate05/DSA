//https://leetcode.com/problems/move-zeroes/

package Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,12};
        move(arr);
    }

    static void move(int[] arr){
        int first = 0, second = 1;

        if (arr.length == 1)
            return;

        while (second < arr.length){
            if (arr[first] == 0 && arr[second] != 0){
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                first++;
                second++;
            }else {
                second++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
