package Arrays;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int[] arr = {5 , 5, 5};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr){
        int second;
        int first = second = -1;

        for (int i : arr){
            if (i > first ){
                second = first;
                first = i;
            }else if (i > second && i != first)
                second = i;
        }
        return second;
    }
}
