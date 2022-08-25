package Patterns;

public class NumberTriangle3 {
    public static void main(String[] args) {
        print(5);
    }
    
    static void print(int n){
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
