package BitManipulation.BinaryOpratore;

import java.util.Scanner;

public class BinaryOddEven {

    static  boolean oddEven (int number){
        System.out.println(number);

        if((number&1) == 0)
        {
            return true;
        }
        else{
            return false;

        }
    }
    public static void main(String[] args) {
        // System.out.println(2^3);
        // System.out.println(2&3);
        // System.out.println(2|3);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1:");
        int number = sc.nextInt();
        System.out.println(oddEven(number));
        
    }
}
