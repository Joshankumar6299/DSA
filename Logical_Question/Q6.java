package Logical_Question;

public class Q6 {

    public static void main(String[] args) {
        // Q6.Write a program to check if a given character is a vowel or consonant. 

        char ch = 'a';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
    }
}
