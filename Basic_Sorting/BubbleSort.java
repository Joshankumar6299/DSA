package Basic_Sorting;


public class BubbleSort {

     static void Bubble(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
    
        }
    }

    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        Bubble(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
