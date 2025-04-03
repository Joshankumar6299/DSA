package PracticePattern;

public class Q38 {

    public static void main(String[] args) {
//           1 
//         2 3 4 
//       3 4 5 6 7 
//     4 5 6 7 8 9 10 
//   5 6 7 8 9 10 11 12 13

        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print("  ");
            }
            int num = i;
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();

        }
    }
}
