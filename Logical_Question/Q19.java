package Logical_Question;

public class Q19 {

    public static void main(String[] args) {
//         Q19.Write a program to check whether a given number is a strong number or  not . 
        // Eg. A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145, 
        // and 40585 are some examples of strong numbers. 

        // 145 is a strong number .  
        // Let’s check how 🤔 
        // Factorial of 1 is 1. 
        // Factorial of 4 is 24. 
        // Factorial of 5 is 120. 
        // Now add every factorial value : 1+24+120 =145 
        // That means Answer is an equal to enter number. 
        // (145 =145 )
        int number = 145;
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is not a Strong Number.");
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
