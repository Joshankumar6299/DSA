package PracticePattern;

public class Q30 {

    public static void main(String[] args) {
        //  4 4 4 4 4 4 4   
        //  4 3 3 3 3 3 4   
        //  4 3 2 2 2 3 4   
        //  4 3 2 1 2 3 4   
        //  4 3 2 2 2 3 4   
        //  4 3 3 3 3 3 4   
        //  4 4 4 4 4 4 4 

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1, size - 1 - j));
                System.out.print(n - min + "");
            }
            System.out.println();
        }
    }
}
