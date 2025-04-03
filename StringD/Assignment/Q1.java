package StringD.Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class Q1 {

    static int countVowel(String str){
        HashSet<Character> vowels =  new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count=0;

        for(int i=0;i<str.length();i++){
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        String str = sc.nextLine();

        System.out.println(countVowel(str));

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        //         System.out.print(str.charAt(i));
        //     }
        // }
    }
}
