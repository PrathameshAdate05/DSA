package Patterns;

public class NumberTriangle2 {
    public static void main(String[] args) {

        print(10);
    }

    static void print(int n){

        for (int i = 1; i < n; i++) {

            //first half
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // spaces
            for (int j = 2; j < (n*2)-(i*2); j++) {
                System.out.print(" ");
            }
            
            // second half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
