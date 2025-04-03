package TwoDArray.Assignment;

public class Q1 {

    static int matrix(int array[][] ){
        int x=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==8){
                    x++;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int array[][] = { {4,7,8},{8,8,7} };
       System.out.println("numbsr of 8 : " + matrix(array));
    }
}
