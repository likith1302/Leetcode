class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int [] ans=new int[2];
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            if(!freq.containsKey(i)){
                ans[1]=i;
            }
            else if(freq.get(i)==2){
                ans[0]=i;
            }
        }
        return ans;
    }
}