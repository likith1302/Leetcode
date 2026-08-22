class Solution {
    public boolean checkDivisibility(int n) {
        int c=n;
        int sum=0;
        int product=1;
     
        while(n!=0){
           int d=n%10;
           n=n/10;
           sum+=d;
           product*=d;
        }
         return c % (sum + product) == 0;

    }
}