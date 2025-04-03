package Assignment;







public class Q1 {

   // static boolean containsDuplicate(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // HashSet<Integer> set =new HashSet<>();
        //     for(int i=0;i<nums.length;i++){
        //         if(set.contains(nums[i])){
        //             return true;
        //         }
        //         else{
        //             set.add(nums[i]);
        //         }
            
        //     }
        //     return false;


   // }

   static void Receiver (int[] nums){
   int start=0;
   int end=nums.length-1;

   while (start<end) {
      int tmp=nums[start];
        nums[start]=nums[end];
        nums[end]=tmp;

        start++;
        end--;
       
   }
   for(int i=0;i<nums.length;i++){
    System.out.print(nums[i]+" ");
   }
 
    
   }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
       Receiver(nums);
        
    }
}
