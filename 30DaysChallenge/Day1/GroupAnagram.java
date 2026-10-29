class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map =new HashMap<>();
        
        for(String s:strs){
            char[] val=s.toCharArray(); 
            Arrays.sort(val);
            String sorted=new String(val);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
}