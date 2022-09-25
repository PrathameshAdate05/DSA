package Arrays;

public class CloseToZero {
    public static void main(String[] args) {
        int[] arr = {-10000,-10000,-10000};
        System.out.println(find(arr));
    }

    static int find(int[] arr){
        int pos = Integer.MAX_VALUE-1, neg = Integer.MIN_VALUE;

        if (arr.length == 1)
            return arr[0];

        for(int i : arr){
            if (i < pos && i >= 0)
                pos = i;

            if (i > neg && i <= 0)
                neg = i;
        }
        System.out.println(neg);
        if (Math.abs(neg) < pos)
            return neg;

        return pos;
    }
}
