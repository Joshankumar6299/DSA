package PracticePattern;

public class Q4 {

    public static void main(String[] args) {
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 

        int n = 5;

        // this is my outer loop
        for (int i = 1; i <= n; i++) {
            // thisis my inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
