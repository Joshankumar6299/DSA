package PracticePattern;

public class Q31 {

    public static void main(String[] args) {
        //    E 
        //    D E 
        //    C D E 
        //    B C D E 
        //    A B C D E

        char ch = 'E';
        for (char i = ch; i >= 'A'; i--) {
            for (char j = i; j <= ch; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
