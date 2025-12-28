class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean[] prm=new boolean[n];
        Arrays.fill(prm, true);   
        prm[0] = false;
        prm[1] = false;
        for(int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j+=i){
                prm[j]=false;
            }
        }
        int count=0;
        for(int i=1;i<n;i++){
            if(prm[i]){
                count+=1;
            }
        }
        return count;

        
    }
}