class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++){
            int diff=k-nums[i];
            if(freq.getOrDefault(diff,0)!=0){
                c+=1;
                freq.put(diff,freq.getOrDefault(diff,0)-1);
                continue;
            }
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        return c;
        
    }
}