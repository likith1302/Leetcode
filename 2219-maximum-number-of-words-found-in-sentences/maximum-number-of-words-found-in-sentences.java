class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=1;
        for(String sen:sentences){
            int ic=1;
            for(char ch:sen.toCharArray()){
                if(ch==' '){
                    ic++;
                }
                c=Math.max(ic,c);
            }
        }
        return c;
    }
}