class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        if (n > s2.length()) return false;
        int[] freq=new int[26];
        int[] sub=new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
            sub[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,sub))return true;
        for(int i=n;i<s2.length();i++){
            sub[s2.charAt(i)-'a']++;
            sub[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(freq,sub))return true;
        }
     return false;
    }
}