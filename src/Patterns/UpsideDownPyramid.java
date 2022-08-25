package Patterns;

public class UpsideDownPyramid {
    public static void main(String[] args) {
        pyramid(8);
    }

    static void pyramid(int n){

        for (int i = 0; i < n; i++) {
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
