package Patterns;

public class Rectangle1 {
    public static void main(String[] args) {
        rec(10);
    }

    static void rec(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
