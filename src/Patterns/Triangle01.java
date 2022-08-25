package Patterns;

public class Triangle01 {
    public static void main(String[] args) {

        triangle(5);
    }

    static void triangle(int n){

        int state = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                state = 1;
            else
                state = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(state);
                if (state == 1)
                    state = 0;
                else
                    state = 1;
            }
            System.out.println();
        }

    }
}
