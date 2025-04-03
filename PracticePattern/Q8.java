package PracticePattern;

public class Q8 {

    public static void main(String[] args) {
        // This program prints the following pattern:
        //      * 
        //     *** 
        //    ***** 
        //   ******* 
        //  *********
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = 0; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
