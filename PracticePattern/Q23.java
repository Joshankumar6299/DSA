package PracticePattern;

public class Q23 {

    public static void main(String[] args) {
// ****** 
// ***** 
// **** 
// *** 
// ** 
// * 
// ** 
// *** 
// **** 
// ***** 
// ******

        int n = 6;

        for (int i = 0; i < n; i++) {

            // this is inner loop
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
