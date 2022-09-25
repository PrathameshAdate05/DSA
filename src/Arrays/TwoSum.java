package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr,target)));
    }

    static int[] sum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])){
                ans[0] = map.get(target - arr[i]);
                ans[1] = i;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}
