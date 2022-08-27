//https://practice.geeksforgeeks.org/problems/reverse-bits3556/1

package Basic_Maths;

import java.util.Arrays;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverse(5));
    }

    static long reverse(long x){

            if (x == 0){
                return 0;
            }

            String s = String.format("%32s",Long.toBinaryString(x)).replace(" ","0");
            char[] temp = s.toCharArray();
            int i = 0, j = s.length()-1;
            while (i <= j){
                char tempch = temp[i];
                temp[i] = temp[j];
                temp[j] = tempch;
                i++;
                j--;
            }
            return Long.parseLong(String.valueOf(temp),2);

    }
}
