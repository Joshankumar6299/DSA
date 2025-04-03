package Recursion;

public class findFirstOccurrence {
    static   int findFirstOccurrence(int arr[],int i,int key){
        // if(i==arr.length){
        //     return -1;
        // }
        // if(arr[i]==key){
        //     return i;
        // }
        // return findFirstOccurrence(arr,key,i+1);

        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }   
        return findFirstOccurrence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(findFirstOccurrence(arr,0,5));
    }
} 
