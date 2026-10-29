//If the array is not sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        

        for(int i=0;i<numbers.length;i++){
            int comple=target-numbers[i];

            if(map.containsKey(comple)){
                arr[0]=map.get(comple)+1;
                arr[1]=i+1;
                break;
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return arr;
    }
}

//If  the array is sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right) {
            int sum=numbers[left]+numbers[right];
            if(sum==target) {
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}