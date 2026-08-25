class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        int p=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int ans=k;
        while(set.contains(ans)){
            ans+=k;
        }
        return ans;
        
    }
}