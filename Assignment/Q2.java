package Assignment;


public class Q2 {

    // static int  findExist (int nums[],int traget){
    //     for(int i=0; i<nums.length;i++){
    //         if(nums[i]==traget){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    static  int serchPart (int nums[],int traget){
       int start=0;
       int  end=nums.length-1;

        while (start<=end) {
           int mid=start+(end-start)/2;

            if(nums[mid]==traget){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(traget>=nums[start] && traget<nums[mid]){
                    end= mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(traget>nums[mid] && traget<=nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int traget=0;
        // System.out.print(findExist(nums, traget));
        System.out.print(serchPart(nums,traget));
    }
}
