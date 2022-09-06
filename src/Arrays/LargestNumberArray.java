//https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

package Arrays;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i : arr)
            if (i > max)
                max = i;

        return max;
    }
}
