package PracticePattern;

public class Q36 {

    public static void main(String[] args) {
        // 1 
        // 1 2 
        // 2 3 5 
        // 5 7 10 15 
        // 15 20 27 37 52 

        int rows = 5;
        int[][] pattern = new int[rows][rows];
        pattern[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            pattern[i][0] = pattern[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                pattern[i][j] = pattern[i][j - 1] + pattern[i - 1][j - 1];
            }
        }

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }

    }
}
