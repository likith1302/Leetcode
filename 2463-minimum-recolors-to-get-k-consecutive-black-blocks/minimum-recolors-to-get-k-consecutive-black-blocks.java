class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min= Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            int c=0;
            int right=i;
            while(right<i+k){
            if(blocks.charAt(right)=='W'){
               c++;
            }
          right++;
        }
        min=Math.min(min,c);
        }
        return min;
    }
}