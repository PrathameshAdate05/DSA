package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }

        int key = arr.length / 2;
        int temp = 0;
        int ele = 0;

        for(int i : map.keySet()){
            if (map.get(i) >= key && map.get(i) > temp){
                temp = map.get(i);
                ele = i;
            }
        }

        return ele;
    }
}
