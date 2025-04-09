package Logical_Question;

public class Q11 {

    public static void main(String[] args) {
        // Q11.Write a program to print fibonacci series.
        int n = 10;
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
