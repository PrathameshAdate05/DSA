package Patterns;

public class FullDiamond {
    public static void main(String[] args) {
        diamond(5);
    }

    static void diamond(int n){

        int m = n;
        for (int i = 0; i < n*2; i++) {

           if (i < n){
               //spaces
               for (int j = 0; j < n-i; j++) {
                   System.out.print(" ");
               }

               //print stars
               for (int j = 0; j < i; j++) {
                   System.out.print(" *");
               }
           }else {

               // spaces
               for (int j = 0; j < i-m; j++) {
                   System.out.print(" ");
               }

               // print stars
               for (int j = 0; j < (m-i)+n; j++) {
                   System.out.print(" *");
               }
           }
            System.out.println();
        }
    }
}
