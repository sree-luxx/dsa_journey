class Solution {
    public int trap(int[] height) {
        int left=1;
        int right=height.length-2;

        int lmax=height[left-1];
        int rmax=height[right+1];

        int water=0;

        while(left<=right){
            if(lmax<rmax){
                water+=Math.max(0,lmax-height[left]);
                
                if(height[left]>lmax){
                    lmax=height[left];
                }
                left++;
            }
            else{
               water+=Math.max(0,rmax-height[right]);

               if(height[right]>rmax){
                rmax=height[right];
               }
               right--;
            }

        }
        return water;
    }
}