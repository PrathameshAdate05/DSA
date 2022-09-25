package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] image = { {1,2,3},
                {4,5,6},
                {7,8,9}};

        rotate(image);
    }

    static void rotate(int[][] image){

        //taking transpose of matrix
        for (int i = 0; i < image.length; i++) {
            for (int j = i; j <image[0].length; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length-j-1];
                image[i][image.length-j-1] = temp;
            }
        }


        //print
        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }
    }
}
