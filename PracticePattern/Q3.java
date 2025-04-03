package PracticePattern;

public class Q3 {

    public static void main(String[] args) {
        // ***** 
        // **** 
        // *** 
        // ** 
        // * 

        int n = 5;
        // this is a outer loop
        for (int i = 0; i < n; i++) {

            // this is inner loop
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
