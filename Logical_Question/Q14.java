package Logical_Question;

public class Q14 {

    public static void main(String[] args) {
        // Q14.Write a program to reverse a given number .

        int number = 12345; 
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

    }
}
