class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
             int count=0;
            for(int j=0;j<m;j++){
                int num=grid[j][i];
                if(num<0){
                    count=Math.max(count,(int)Math.log10(Math.abs(num))+2);
                }
                else if(num==0) count=Math.max(count,1);
                else{
                    count=Math.max(count,(int)Math.log10(num)+1);
                }
        }
        ans[i]=count;
    }
    return ans;
}
}