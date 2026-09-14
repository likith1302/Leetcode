class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] word=sentence.split(" ");
        int n=word.length;
        if(word[0].charAt(0)!=word[n-1].charAt(word[n-1].length()-1))return false;
        for(int i=0;i<n-1;i++){
            String str1=word[i];
            String str2=word[i+1];
            if(str1.charAt(str1.length()-1)!=(str2.charAt(0))) return false;
        }
        return true;
    }
}