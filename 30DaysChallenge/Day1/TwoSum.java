class Solution {
    boolean twoSum(int arr[], int target) {
       HashSet<Integer> map=new HashSet<>();
       for(int i=0;i<arr.length;i++){
           int remainder=target-arr[i];
           if(map.contains(remainder)){
               return true;
           }
           else{
               map.add(arr[i]);
           }
       }
       return false;
        
    }
}