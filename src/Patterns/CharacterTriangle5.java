package Patterns;

public class CharacterTriangle5 {
    public static void main(String[] args) {
        print(5);
    }
    
    static void print(int n){
        int k = 65 + n-1;

        for (int i = 0; i < n; i++) {
            k -= i;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(k+j));
            }
            System.out.println();
            k = 65 + n-1;
        }
    }
}
