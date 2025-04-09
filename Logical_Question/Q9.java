package Logical_Question;

public class Q9 {
    public static void main(String[] args) {
        // Q9.Write a program to check if a given number is a prime number. 
        int number = 5;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
            isPrime = false;
            break;
            }
        }

        System.out.println(number + (isPrime && number > 1 ? " is a prime number." : " is not a prime number."));

      
    }
}
