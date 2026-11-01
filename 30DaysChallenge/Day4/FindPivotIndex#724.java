class Solution {
    public int pivotIndex(int[] nums) {
       int totSum=0;
       for(int i=0;i<nums.length;i++){
        totSum+=nums[i];
       }
       int lsum=0;
       for(int i=0;i<nums.length;i++){
        if(totSum-lsum-nums[i]==lsum){
            return i;
        }
        lsum+=nums[i];
       }
       return -1;
    }
}