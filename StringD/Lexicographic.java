package StringD;

public class Lexicographic {
    public static void main(String[] args) {
        String str[] = {"Apple","Mango","banana"};

        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);
        
    }
}
