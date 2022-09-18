package Basic_Maths;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(25));
        primeRange(50,70);
    }

    static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void primeRange(int start, int end){
        for (int i = start; i <= end ; i++) {
            boolean state = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    state = false;
                    break;
                }

            }
            if (state)
                System.out.println(i);
        }
    }
}
