//https://leetcode.com/problems/reverse-integer/

package Basic_Maths;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    static int reverse(int x){
        boolean sign = false;
        if (x < 0){
            sign = true;
            x = Math.abs(x);
        }
        char[] s = Integer.toString(x).toCharArray();
        int i = 0, j = s.length-1;

        while (i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

       try{
           int ans = Integer.parseInt(String.valueOf(s));
           if (sign)
               return (0 - ans);
            else
                return ans;
       }catch (Exception c){
           return 0;
       }

    }
}
