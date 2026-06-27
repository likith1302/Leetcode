class Solution {
    public int scoreOfString(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int val1=(int)ch1;
            int val2=(int)ch2;
            res+=Math.abs(val1-val2);
        }
        return res;
        
    }
}