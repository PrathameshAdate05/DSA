package Arrays;

public class TwoConsecutiveOnes {
    public static void main(String[] args) {
        print();
    }

    static void print(){
        for (int i = 0; i < 50; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(i+ " -> "+ Integer.toBinaryString(i));
        }
    }
}
