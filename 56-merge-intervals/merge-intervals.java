class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] cur=intervals[0];
        merged.add(cur);
        for(int[] last:intervals){
        if(cur[1]>=last[0]){
            cur[1]=Math.max(cur[1],last[1]);
        }
        else{
            cur=last;
            merged.add(cur);
        }
        }
         return merged.toArray(new int[merged.size()][]);

    }
}