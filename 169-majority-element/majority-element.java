class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer> seen=new HashMap<>();
    int m=0;
    int major=0;
    for(int num:nums){
        seen.put(num,seen.getOrDefault(num,0)+1);
        if(seen.get(num)>m){
            m=seen.get(num);
            major=num;
        }
    }
      
        return major;
    }
}