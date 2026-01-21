class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;//child
        int j=0;//cookie
        while(j< s.length && i<g.length){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}