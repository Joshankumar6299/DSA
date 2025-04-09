package Logical_Question;

public class Q3 {
    public static void main(String[] args) {
        // Q3.Write a program to check if a given year is a leap year. 
        int year = 2024; 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
