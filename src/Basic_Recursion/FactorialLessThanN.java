//https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%5B%5D=-1&page=1&query=problemTypefunctionaldifficulty%5B%5D-1page1

package Basic_Recursion;

import java.util.ArrayList;

public class FactorialLessThanN {

    static  ArrayList<Long> factorials = new ArrayList<>();
    static long fact = 1;

    public static void main(String[] args) {
        System.out.println(find(9));
    }

    static ArrayList<Long> find(long n){
        recursion(2,n);
        return factorials;
    }

    static void recursion(long i, long n){
        if (fact <= n){
            factorials.add(fact);
            fact *= i;
            recursion(i+1,n);
        }
    }
}
