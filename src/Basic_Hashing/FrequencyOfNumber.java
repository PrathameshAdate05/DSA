//https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

package Basic_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        int n = 4;
        int p = 3;
        System.out.println(Arrays.toString(frequencyCount(arr,n,p)));
    }

    static int[] frequencyCount(int[] arr, int n, int p){
        HashMap<Integer, Integer> hashMap = new HashMap<>(p);
        for (int i = 1; i <= p; i++) {
            hashMap.put(i,0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }

        System.out.println(hashMap.get(4));

        int i = 0;
        for(int x : hashMap.values()){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}
