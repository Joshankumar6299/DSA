package Recursion;

public class power {

    static int optimazationPower(int a,int n){
        // if(n==0){
        //     return 1;
        // }
        // if(n%2==0){
        //     return optimazationPower(a,n/2) * optimazationPower(a,n/2);
        // }
        // return a * optimazationPower(a,n-1);

        if(n==0){
            return 1;
        }
       
        int halfPower = optimazationPower(a,n/2);
        int optimaztionSq = halfPower * halfPower;

        // int optimaztionSq = optimazationPower(a,n/2) * optimazationPower(a,n/2);
        if(n % 2 !=0){
            // return a * optimaztionSq;
            optimaztionSq *= a;
        }
        return optimaztionSq;
    }

    public static void main(String[] args) {
        int a=2,n=6;
        System.out.println(optimazationPower(a,n));
       
    }
}
