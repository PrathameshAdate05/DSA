package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(maxOnes(arr));
    }

    static int maxOnes(int[] arr){
        int count = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1)
                temp = 0;
            else
                temp++;

            if (temp > count)
                count = temp;
        }

        return count;
    }
}
