class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        int count=0;
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(Integer num:freq.values()){
            count+=(num/2)*2;
            if(count%2==0 && num%2==1){
                count++;
            }
        }
        return count;
    }
}