package PracticePattern;

public class Q33 {

    public static void main(String[] args) {
        //    E D C B A 
        //    D C B A 
        //    C B A 
        //    B A 
        //    A

        char ch = 'E';
        for (char i = ch; i >= 'A'; i--) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
