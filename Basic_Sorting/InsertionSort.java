package Basic_Sorting;

public class InsertionSort {

    static void Insertion(int arr[] ){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
           int  priv=i-1;
           while (priv>=0 && arr[priv]>curr) {
            arr[priv+1]=arr[priv];
            priv--;
           }
           arr[priv+1]=curr;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
