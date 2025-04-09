package Logical_Question;

public class Q15 {

    public static void main(String[] args) {
        // Q15.Write a program to check whether a given number is armstrong or not.
        int number = 153;
        int originalNumber = number;
        int result = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += digit * digit * digit;
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
