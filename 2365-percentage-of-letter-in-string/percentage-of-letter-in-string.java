class Solution {
    public int percentageLetter(String s, char letter) {
        int l=s.length();
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch==letter) c+=1;
        }
        double ans=(double)c/l*100;
        return (int)ans;
    }
}