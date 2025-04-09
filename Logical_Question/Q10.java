package Logical_Question;

public class Q10 {

    public static void main(String[] args) {
        // Q10.Write a program to find the smallest of four numbers. 

        int num1 = 19, num2 = 21, num3 = 43, num4 = 323;

        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            System.out.println(num1 + " smallest of four number");
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            System.out.println(num2 + " smallest of four number");
        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            System.out.println(num3 + " smallest of four number");
        } else {
            System.out.println(" smallest of four number");
        }

    }
}
