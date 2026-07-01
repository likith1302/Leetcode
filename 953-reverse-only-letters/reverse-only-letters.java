class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = sb.length() - 1;

        while (l < r) {
            if (!Character.isLetter(sb.charAt(l))) {
                l++;
            } else if (!Character.isLetter(sb.charAt(r))) {
                r--;
            } else {
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
        }

        return sb.toString();
    }
}
