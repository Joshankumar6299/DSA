package Logical_Question;

public class Q4 {
    public static void main(String[] args) {
        // Q4.Write a program to find the largest of three numbers. 
        int num1 = 10, num2 = 20, num3 = 15;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}



























