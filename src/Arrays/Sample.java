package Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {2,-1,-6,5};
        System.out.println(product(arr));
    }

    static int product(int[] arr){
        int p = 1;
        for(int i : arr){
            p *= i;
        }
        return p;
    }
}
