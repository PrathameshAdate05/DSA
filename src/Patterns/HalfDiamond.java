package Patterns;

public class HalfDiamond {
    public static void main(String[] args) {
        diamond(5);
    }

    static void diamond(int n){
        int m = n;

        for (int i = 0; i < n*2; i++) {

            if (i < n){
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
            }else{
                for (int j = 0; j < (m-i)+n; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();


        }
    }
}
