package PracticePattern;

public class Q13 {

    public static void main(String[] args) {
        //      * 
        //     * * 
        //    *   * 
        //   *     * 
        //  ********* 

        int n = 5;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < (n*2-1); i++) {
            System.out.print("*");
        }

    }
}
