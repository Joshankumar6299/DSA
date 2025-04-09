package Array;

import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int number[][] = new int[rows][col];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.println("X found at location(" + i + "," + j + ")");
                }
            }
        }
    }
}
