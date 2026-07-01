class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while (i < sb.length() - 1) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            
            // If they are same letter but opposite case
            if (Math.abs(c1 - c2) == 32) {
                sb.delete(i, i + 2); // remove both
                if (i > 0) i--;      // step back to re-check previous pair
            } else {
                i++;
            }
        }
        
        return sb.toString();
    }
}
