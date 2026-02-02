class Solution {
    public boolean checkRecord(String s) {
        int[] res={0,0,0};
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
              if(i>0 && i<s.length()-1 && s.charAt(i-1)=='L' && s.charAt(i+1)=='L'){
                return false;
              }
              else{
                res[2]=0;
            }
            }
            else if(s.charAt(i)=='A'){
                res[1]+=1;
            }
        }
        if(res[1]<2 && res[2]<3){
            return true;
        }
        return false;
    }
}