//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

package Strings;

import java.util.HashMap;

public class EqualCharacters {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(check(s));
    }

    static boolean check(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (char c : s.toCharArray()){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }

        count = (int) map.values().toArray()[0];

        for (int i : map.values()){
            if (i != count)
                return false;
        }

        return true;
    }
}
