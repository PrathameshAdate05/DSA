//https://leetcode.com/problems/rearrange-array-elements-by-sign/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class NegativePositive {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangedOpt(arr)));
    }

    static int[] rearrange(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] ans = new int[arr.length];
        boolean flag = true;
        int positive = 0, negative = 0;

        for(int i : arr){
            if(i > 0)
                pos.add(i);
            else
                neg.add(i);
        }

        for(int i=0;i<ans.length;i++){
            if(flag){
                ans[i] = pos.get(positive);
                positive++;
                flag = false;
            }else{
                ans[i] = neg.get(negative);
                negative++;
                flag = true;
            }
        }
        return ans;
    }

    static int[] rearrangedOpt(int[] arr){
        int[] ans = new int[arr.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            }else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
}
