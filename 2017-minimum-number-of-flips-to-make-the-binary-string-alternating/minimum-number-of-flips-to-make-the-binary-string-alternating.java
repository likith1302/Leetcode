class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int min=n; 
        String st=s+s;
        StringBuilder p1=new StringBuilder(); 
        StringBuilder p2=new StringBuilder(); 
        for(int i=0;i<2*n;i++){
            p1.append(i%2==0?'0':'1');
            p2.append(i%2==0?'1':'0');
        }
        int p1d=0;   
        int p2d=0;
        for(int i=0;i<2*n;i++){
            if(p1.charAt(i)!=st.charAt(i))p1d++;
            if(p2.charAt(i)!=st.charAt(i))p2d++;
            if(i>=n){
                if(p1.charAt(i-n)!=st.charAt(i-n))p1d--;
            if(p2.charAt(i-n)!=st.charAt(i-n))p2d--;
            }
            if(i>=n-1){
               min=Math.min(min,Math.min(p1d,p2d));
            }
        }    
        return min;
        }
}
