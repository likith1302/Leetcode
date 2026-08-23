class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int max=0;
        int maxidx=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1) sum++;
            }
            if(sum>max){
                max=sum;
                maxidx=i;
            }
        }
    return new int[]{maxidx, max};
    }
}