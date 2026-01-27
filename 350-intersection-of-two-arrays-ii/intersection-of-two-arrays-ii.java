class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> freq=new HashMap<>();
      ArrayList<Integer> r=new ArrayList<>(); 
      for(int num:nums1){
        freq.put(num,freq.getOrDefault(num, 0) + 1);
      }
      for(int num:nums2){
        if(freq.getOrDefault(num,0)>0){
            r.add(num);
            freq.put(num,freq.get(num) -1);
        }
      }
      int[] re=new int[r.size()];
      for(int i=0;i<r.size();i++){
        re[i]=r.get(i);
      } 
      return re;
    }
}