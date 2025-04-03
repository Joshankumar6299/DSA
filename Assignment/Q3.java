package Assignment;
public class Q3 {

    static int stackProce(int prices[]){
       int maxproce=0;
       int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
               int profit=prices[i]-buyPrice;
                maxproce=Math.max(maxproce, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxproce;
    }
    
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stackProce(prices));
    }
}
