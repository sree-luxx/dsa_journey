class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1;
        int right=0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }//finding upper bound
        
         while(left<=right){
            int mid=left+(right-left)/2;
            int value=checkValue(mid,piles); //value is the hr here
            if(value<=h){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
         }
         return left;
    }

    public int checkValue(int mid,int[] piles){
        int hr=0;
         for(int pile:piles){
             hr += Math.ceil((double) pile / mid);
         }
         return hr;
         //finds the hour taken for a particular mid value
    }
}