package Logical_Question;

public class Q7 {

    public static void main(String[] args) {
        // Q7.Write a program to check if a given number is divisible by 5 and 11.

        int n = 55;
        if (n % 5 == 0 || n % 11 == 0) {
            System.out.println(n + " number is divisible by 5 and 11");
        } else {
            System.out.println(n + " number is not divisible by 5 and 11");
        }
    }
}
