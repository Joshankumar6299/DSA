package PracticePattern;

public class Q26 {

    public static void main(String[] args) {
        //   1 1 1 1 1 1 
        //   2 2 2 2 2 
        //   3 3 3 3 
        //   4 4 4 
        //   5 5 
        //   6  

        int n = 6;
        for (int i = 1; i <= n; i++) {
            // this is inner loop
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println();
    }
}
