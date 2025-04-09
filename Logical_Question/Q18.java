package Logical_Question;

public class Q18 {

    public static void main(String[] args) {
//         Q18.Write a program to check whether a given number is a Perfect Number or not (a 
// perfect number is a positive integer that is equal to the sum of its positive proper divisors, that 
// is, divisors excluding the number itself.). 
// Example: For instance, 6 has proper divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number. 
// The next perfect number is 28, since 1 + 2 + 4 + 7 + 14 = 28.

        int number = 28;
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}
