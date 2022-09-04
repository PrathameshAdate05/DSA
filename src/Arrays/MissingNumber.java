package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,4};

        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr){
        int i = 0;

        while (i < arr.length){
            if (i != arr[i]-1){
                swap(arr, i, arr[i]-1);
                i++;
            }else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]-1)
                return arr[j];
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
