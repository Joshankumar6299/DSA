package PracticePattern;

public class Q32 {

    public static void main(String[] args) {
        // This code prints the given pattern
        //    a 
        //    B c 
        //    D e F 
        //    g H i J 
        //    k L m N o 
        int n = 5;
        char ch = 'a';
        boolean isUpperCase = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (isUpperCase) {
                    System.out.print(Character.toUpperCase(ch) + " ");
                } else {
                    System.out.print(ch + " ");
                }
                ch++;
                isUpperCase = !isUpperCase;
            }
            System.out.println();
        }

    }
}
