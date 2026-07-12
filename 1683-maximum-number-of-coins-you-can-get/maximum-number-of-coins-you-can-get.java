class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int n=piles.length/3;
        for(int i=1;i<=n;i++){
                 sum+=piles[piles.length-i*2];                 
        }
        return sum;
    }
}