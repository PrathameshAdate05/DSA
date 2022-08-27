package Patterns;

public class AdvancePattern1 {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){

        // upper part
        for (int i = 0; i < n/2; i++) {
            //stars
            for (int j = i; j < n/2; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j =i ; j <n/2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // bottom part
        for (int i = 0; i < n/2; i++) {

            //stars
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = i; j <n/2-1; j++) {
                System.out.print(" ");
            }

            //spaces
            for (int j = i; j < n/2-1; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
