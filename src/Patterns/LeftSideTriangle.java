package Patterns;

public class LeftSideTriangle {
    public static void main(String[] args) {
        lst(8);
    }

    static void lst(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
