package Array;

import java.util.Scanner;

public class twoDArray {

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

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
