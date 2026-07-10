class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0,right=0;
        int cost=0,maxlen=0;
        while(right<s.length()){
            cost+=Math.abs(s.charAt(right)-t.charAt(right));
            while(cost>maxCost){
                cost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}