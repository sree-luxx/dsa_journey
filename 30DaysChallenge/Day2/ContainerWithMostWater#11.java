class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=Integer.MIN_VALUE;

        while(left<right){
            int val=Math.min(height[left],height[right])*(right-left);
            res=Math.max(res,val);

            if(height[left]<height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return res;
    }
}