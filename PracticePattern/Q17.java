package PracticePattern;

public class Q17 {

    public static void main(String[] args) {
        //      1 
        //     212 
        //    32123 
        //   4321234 
        //    32123 
        //     212 
        //      1

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
