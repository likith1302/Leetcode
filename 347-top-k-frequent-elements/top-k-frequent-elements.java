class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int c:nums){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));
        int result[]=new int[k];
        for(int i=0;i<k;i++){
        result[i]=list.get(i).getKey();
           }
        return result;
    }
}