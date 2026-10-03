class Solution {
    public int repeatedStringMatch(String a, String b) {
        int x = a.length();
        int y = b.length();
        int d = y / x;
        
        String new1 = a.repeat(d);
        String new2 = a.repeat(d + 1);
        String new3 = a.repeat(d + 2);
        
        if (new1.contains(b)) return d;
        if (new2.contains(b)) return d + 1;
        if (new3.contains(b)) return d + 2;
        return -1;
    }
}
