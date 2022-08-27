//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

package Basic_Maths;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr) {
        int jump = 1;
        int maxReach = arr[0];
        int step = arr[0];

        if (arr[0] == 0)
            return 0;

        if (arr.length <= 1)
            return 0;

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length-1)
                return jump;
            maxReach = Math.max(maxReach, i+arr[i]);
            step--;
            if (step == 0){
                jump++;

                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }


        return -1;
    }
}
