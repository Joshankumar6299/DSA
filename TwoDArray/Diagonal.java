package TwoDArray;

public class Diagonal {


    
    



    // static int DiagonalSum(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                 sum+=matrix[i][j];

    //             }
    //             else if(i!=j){
    //                 sum+ = matrix[i][matrix.length-i-1];
    //             }
    //         }
    //         return sum;
    //     }

    static int DiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum +=matrix[i][i];
            if(i!= matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum; 
        }
       
    
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.print("sum :" +DiagonalSum(matrix));
    }
}
