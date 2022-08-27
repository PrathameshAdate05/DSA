package Basic_Maths;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(35));
    }

    static int countDigits(int n){
        int count = 0;
        int m = n;
        while (n != 0){
            int rem = n % 10;
            if (rem != 0 && m % rem == 0)
                count++;
            n = n / 10;
        }
        return count;
    }

    static int countDigitOptimized(int n){
        return (int)Math.log10(n)+1;
    }
}
