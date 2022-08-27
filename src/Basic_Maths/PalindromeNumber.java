//https://practice.geeksforgeeks.org/problems/palindrome0746/1

package Basic_Maths;

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    static String isPalindrome(int n){
        String s = String.valueOf(n);
        int i = 0, j = s.length()-1;

        while (i <= j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else
                return "No";
        }
        return "Yes";
    }
}
