class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        int i = s.length() - 1;
        
        while (i >= 0) {
            
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            
            if (i < 0) break;
            
            // 2Find end of word
            int j = i;
            
            // Move to start of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            // 4Append word
            sb.append(s.substring(i + 1, j + 1));
            sb.append(" ");
        }
        
        // Remove last extra space
        return sb.toString().trim();
    }
}
