class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res =new int[n];
        if(k>0){
            for(int i=0;i<code.length;i++){
                int j=(i+1)%n;// move forward in circular array
                int sum=0;
                int c=0;
                while(c<k){
                    sum+=code[j];
                    j=(j+1)%n;
                    c++;
                }
                res[i]=sum;
            }
        }
        else if(k<0){
            for(int i=0;i<code.length;i++){
                int j=(i-1+n)%n;// move back in circular array
                int sum=0;
                int c=0;
                while(c<Math.abs(k)){
                    sum+=code[j];
                    j=(j-1+n)%n;
                    c++;
                }
                res[i]=sum;
            }
        }
        else if(k==0){
            for(int i=0;i<code.length;i++){
             res[i]=0;
            }
        }
        return res;
    }
}