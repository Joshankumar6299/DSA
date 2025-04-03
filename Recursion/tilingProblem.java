package Recursion;

public class tilingProblem {
    static  int tilingProblem(int n){ // 2 x n (flower size)
        if(n==0 || n==1){
            return 1;
        }

        // kaam 
        // vertical
        int fnm1 = tilingProblem(n-1); 

        // horizontal
        int fnm2 = tilingProblem(n-2);

        int ways = fnm1 + fnm2;
        return ways;

    }
    public static void main(String[] args) {
    int n = 3;
    System.out.println(tilingProblem(n));
    }
}
