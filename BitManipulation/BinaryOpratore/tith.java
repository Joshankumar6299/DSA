package BitManipulation.BinaryOpratore;

public class tith {
    // static int getIth(int n,int i){
    //      //  get ith 

    //     if(((n&1)<<i)==0){
    //         return 0;

    //     }
    //     else{
    //         return 1;
    //     }

    //     // Set ith

    // }

    // static int setIth(int n , int i){
    //     return n | (1<<i);

    // }

    static int clearIth(int n,int i){
        return n & (0<<i);
    }
    public static void main(String[] args) {
        
        // int n= 15;
        
        //  get ith 

        // System.out.println((n&1)<<1);
        // System.out.println((n&1)<<2);
        // System.out.println((n&1)<<3);
        
        // System.out.println(getIth(10 ,3));
        System.out.println(clearIth(10, 2));

        
        
    }
}
