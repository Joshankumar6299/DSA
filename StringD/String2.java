package StringD;

public class String2 {
    static boolean StringA(String str){
        int s=0;
        int e=str.length()-1;
        while (s<e) { 
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="maam";
        System.out.println(StringA(str));
    }
}
