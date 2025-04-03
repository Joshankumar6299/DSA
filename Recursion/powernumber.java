package Recursion;

public class powernumber {
    static  int power(int x,int n){
        if(n==0){
            return 1;
        }
        int nm1=power(x,n-1);
        return x*nm1;
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
