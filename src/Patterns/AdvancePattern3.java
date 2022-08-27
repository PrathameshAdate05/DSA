package Patterns;

public class AdvancePattern3 {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
