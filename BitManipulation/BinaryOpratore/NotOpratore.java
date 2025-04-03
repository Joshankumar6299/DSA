package BitManipulation.BinaryOpratore;

public class NotOpratore {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=~a;
        int d=~b;

        // Binary number of 6 is 110
        // ~110 = 001
        System.out.println(c);
        System.out.println(d);
    }
}
