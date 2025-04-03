package StringD.Assignment;

import java.util.Arrays;

public class Q4 {

    static  boolean anagram(String s1 ,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            char [] ch1 = s1.toCharArray();
            char [] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                return false;
            }
            else{
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        System.out.println(anagram(str1,str2));
    }
}
