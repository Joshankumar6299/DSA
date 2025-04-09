package Logical_Question;

public class Q8 {

    public static void main(String[] args) {
        // Q8.Write a program to check if a given string is a palindrome.

        String str = "maam";
        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palinrome");
        } else {
            System.out.println(str + "is a not palinrome");
        }
    }
}
