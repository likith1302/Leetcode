class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=nums[i].charAt(i);
            ans.append(ch=='0'?'1':'0');
        }
        return ans.toString();

    }
}