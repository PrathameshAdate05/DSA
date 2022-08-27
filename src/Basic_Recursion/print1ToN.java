//https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/

package Basic_Recursion;

public class print1ToN {

    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
            if (n > 0){
                System.out.println(n);
                print(n-1);
            }
            return;
    }
}
