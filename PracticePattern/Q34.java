package PracticePattern;

public class Q34 {

    public static void main(String[] args) {
        //    1      1 
        //    12    21 
        //    123  321 
        //    12344321

        int n = 4;
        for (int i = 1; i <= n; i++) { // this is for row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int space = 2 * (4 - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
