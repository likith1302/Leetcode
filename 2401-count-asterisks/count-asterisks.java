class Solution {
    public int countAsterisks(String s) {
        boolean flag = true;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='|') flag=!flag;
            if(ch=='*' && flag) count++;
        }
        return count;
        
    }
}