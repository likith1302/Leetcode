class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();
        if(rowIndex==0){
         return Arrays.asList(1);
        }
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(rowIndex==1){
            return Arrays.asList(1,1);
        }
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=result.get(i-1);
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=0;j<i-1;j++){
                cur.add(prev.get(j)+prev.get(j+1));
            }
            cur.add(1);
            result.add(cur);
        }
        return result.get(rowIndex);
        
    }
}