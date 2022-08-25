package Patterns;

public class HalfPyramid {
    public static void main(String[] args) {
        pyramid(5);
    }

    static void pyramid(int n){

        // print spaces
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
