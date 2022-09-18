package Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int max1 = arr[0], max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2)
                max2 = arr[i];
        }

        for (int k : arr)
            if (k < min)
                min = k;

        return min;
    }
}
