//https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

package Basic_Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
    }

    static String isArmstrong(int n){
        int temp = 0, m = n;

        while (n != 0){
            int rem = n % 10;
            temp += (rem * rem * rem);
            n /= 10;
        }
        if (temp == m)
            return "Yes";
        return "No";
    }
}
