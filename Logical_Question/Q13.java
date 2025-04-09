package Logical_Question;

public class Q13 {

    public static void main(String[] args) {
        // Q13.Write a program to check whether a given number is Palindrome or not .
        int num = 121;
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }
    }
}
