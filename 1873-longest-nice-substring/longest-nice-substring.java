class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isnice(sub)){
                    if(sub.length()>ans.length()){
                        ans=sub;
                    }
                }
            }
        }
        return ans;
    }
    public boolean isnice(String sub){
        HashSet<Character> set=new HashSet<>();
        for(char c:sub.toCharArray()){
            set.add(c);
        }
        for(char c:sub.toCharArray()){
            if(Character.isLowerCase(c)){
                if(!set.contains((char)(c-32)))return false;
            }
            else{
                if(!set.contains((char)(c+32)))return false;
            }
        }
        return true;
    }
}