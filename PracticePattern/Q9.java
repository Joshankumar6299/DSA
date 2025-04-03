package PracticePattern;

public class Q9 {

    public static void main(String[] args) {
        // ********* 
        //  ******* 
        //   ***** 
        //    *** 
        //     *  

        //     int n = 5;
        //     for (int i = 0; i < n; i++) {
        //         // print leading spaces
        //         for (int sp = 0; sp < i; sp++) {
        //             System.out.print(" ");
        //         }
        //         // print stars
        //         for (int j = 0; j < (2 * (n - i) - 1); j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        int n = 5;
        for (int i = n; i >= 1; i--) {
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
