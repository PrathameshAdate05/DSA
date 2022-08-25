package Patterns;

public class CharacterTriangle4 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        int k = 65;

        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            // first half
            for (int j = 0; j < i; j++) {
                System.out.print((char)(k+j));
            }

            //second half
            for (int j = i; j >= 0 ; j--) {
                System.out.print((char)(k+j));
            }

            System.out.println();
            }
        }
    }

