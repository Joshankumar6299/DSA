package Assignment;
public class Q4 {

    static int waterTrap (int water[]){
        int n = water.length;
        int leftMax[]=new int[n];
         leftMax[0]=water[0];

        for(int i=1;i<n;i++){
           leftMax[i]=Math.max(leftMax[i-1], water[i]);

        }
        int rightMax[]=new int[n];

       rightMax[n-1]=water[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], water[i]);
        }
        int wt=0;

        for(int i=0;i<n;i++){
            wt+=Math.min(rightMax[i],leftMax[i])-water[i];
        }
        return wt;

    }
    public static void main(String[] args) {
        // int water[]={4,2,0,3,2,5};
        int water[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(waterTrap(water));
    }
}
