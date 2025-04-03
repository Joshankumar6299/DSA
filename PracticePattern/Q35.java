package PracticePattern;

public class Q35 {

    public static void main(String[] args) {
//    1 
//    3  2 
//    4  5 6 
//    10 9 8 7 

        int n = 4;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int start = num + i - 1;
                for (int j = 0; j < i; j++) {
                    System.out.print((start - j) + " ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print((num + j) + " ");
                }
            }
            num += i;
            System.out.println();
        }
    }
}
