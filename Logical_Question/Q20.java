package Logical_Question;

public class Q20 {

    public static void main(String[] args) {
        // Q20. Find the maximum , minimum and sum of all numbers from the given array . 
        // Num = [1,5,7,9,-1,10,40,4,49]
        int[] num = {1, 5, 7, 9, -1, 10, 40, 4, 49};
        int max = num[0];
        int min = num[0];
        int sum = 0;

        for (int n : num) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            sum += n;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
    }
}
