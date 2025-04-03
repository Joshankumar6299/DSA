package PracticePattern;

public class Q14 {

    public static void main(String[] args) {

        //   ********* 
        //   *     * 
        //    *   * 
        //     * * 
        //      *    
        int n = 5;

        for (int i = 0; i < (n * 2 - 1); i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
