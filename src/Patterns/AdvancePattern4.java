package Patterns;

public class AdvancePattern4 {
    public static void main(String[] args) {
        print(7);
    }

    static void print(int n){

        int k = n-3;

        for (int i = 0; i < n/2+1; i++) {

            //upper left part
            for (int j = 0; j <= i; j++) {
                System.out.print(k--+" ");
            }
            // upper middle part
            k = n-3-i;
            for (int j = 0; j < (n-2)-(i*2); j++) {
                System.out.print(k+" ");
            }

            //upper right part
            k = n-3;
            for (int j = n-3-i; j <= n-3; j++) {
                if (i == n/2+1)
                    System.out.print("");
                else
                    System.out.print(j+" ");
            }

            System.out.println();
            k = n-3;
        }
    }
}
