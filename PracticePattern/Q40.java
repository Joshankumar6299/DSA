package PracticePattern;

public class Q40 {

    public static void main(String[] args) {
        //    3 3 3 
        //    3 1 3 
        //    3 2 3 
        //    3 3 3 
        int n = 4;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("3 ");
                }
            } else {
                for (int k = 0; k < 3; k++) {
                    if (k == 0 || k == 2) {
                        System.out.print("3 ");
                    } else {
                        System.out.print(k + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
