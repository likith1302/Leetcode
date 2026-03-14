class Solution {
    public String reversePrefix(String s, int k) {
        String ans="";
        int d=k;
        while(k!=0){
            ans+=s.charAt(k-1);
            k--;
        }
        for(int i=d;i<s.length();i++){
          ans+=s.charAt(i);
        }
        return ans;
    }
}