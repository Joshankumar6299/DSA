package PracticePattern;

public class Q19 {

    public static void main(String[] args) {
        //    *        * 
        //    **      ** 
        //    ***    *** 
        //    ****  **** 
        //    ********** 
        //    ****  **** 
        //    ***    *** 
        //    **      ** 
        //    *        * 
        int n = 5;
        for (int i = n; i >= 1; i--) { // this is for row
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 2; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) { // this is for row
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 2; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
