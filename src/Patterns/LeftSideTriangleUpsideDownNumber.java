package Patterns;

public class LeftSideTriangleUpsideDownNumber {
    public static void main(String[] args) {
        lstudn(8);
    }

    static void lstudn(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
