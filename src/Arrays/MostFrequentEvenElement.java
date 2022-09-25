package Arrays;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] arr = {29,47,21,41,13,37,25,7};
        System.out.println(mostFrequent(arr));
    }

    static int mostFrequent(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ele = -1, freq = 0;
        boolean flag = false;
        for (int i : arr){
            if (i % 2 == 0){
                if (!map.containsKey(i))
                    map.put(i,1);
                else
                    map.put(i,map.get(i)+1);
                flag = true;
            }
        }

        if (!flag)
            return -1;
        else{
            for(int i : map.keySet()){
                if (map.get(i) > freq){
                    ele = i;
                    freq = map.get(i);
                }else if(map.get(i) == freq && i < ele){
                    ele = i;
                }
            }
        }
        return ele;
    }
}
