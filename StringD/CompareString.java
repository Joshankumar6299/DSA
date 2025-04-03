package StringD;

public class CompareString {
    public static void main(String[] args) {
        String s1="Yash";
        String s2="Yash";
        String s3=new String("Yash");

        // if(s1==s3){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }


        // .equal 
        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
