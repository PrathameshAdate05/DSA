package Patterns;

public class CharacterTriangle2 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        int k = 65;

        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(k+j));
            }
            System.out.println();
        }
    }
}
