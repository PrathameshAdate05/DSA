package Patterns;

public class LeftSideTriangleUpsideDown {
    public static void main(String[] args) {
        lstud(8);
    }

    static void lstud(int n){
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
