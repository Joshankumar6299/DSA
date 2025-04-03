package TwoDArray;

public class SerchSortMatrix {
    static boolean SerchSort(int arr[][],int key){
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j]==key){
        //             System.out.println("found");
        //             return true;
        //         }
        //     }
        // }
        // System.out.println("Not found");
        // return false;

      


        int row=0;
        int col=arr[0].length-1;
        while(col >=0 && row<=arr.length-1){
            if(arr[row][col]==key){
                System.out.print("found" );
                return true;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not Found");
        return false;
       
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,39},{32,33,39,50}};
        SerchSort(arr, 20);
    }
}
