package Recursion;

public class friendsPairingProblem {
    static int friendsPairingProblem(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // choice
        // single
        int fnm1 = friendsPairingProblem(n-1);

        // pair
        int fnm2 = friendsPairingProblem(n-2);

        //  pair way
        int pairway = (n-1) * fnm2;

        int totalway = fnm1 + pairway;
        return totalway;


        // this is second solution in this problem
        
        //return friendsPairingProblem(n-1) + (n-1) * friendsPairingProblem(n-2);

    }
    public static void main(String[] args) {
        System.out.println(friendsPairingProblem(3));
    }
}
