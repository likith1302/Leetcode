class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        for(int fn:friends){
            set.add(fn);
        }
        List<Integer> ans=new ArrayList<>();
        for(int id:order){
            if(set.contains(id)){
            ans.add(id);
            }
        }
        int[] a=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
        }
        return a;
    }
}