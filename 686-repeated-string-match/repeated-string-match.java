class Solution {
    public int repeatedStringMatch(String a, String b) {
        int x = a.length();
        int y = b.length();
        int d = y / x;
        for(int i=d;i<d+4;i++){
             String str = a.repeat(i);
             if(str.contains(b))return i;
        } 
        return -1;
    }
}
