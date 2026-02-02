class Solution {
    public boolean checkRecord(String s) {
        int absences = 0;
        int lateStreak = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                absences++;
                if (absences >= 2) return false; 
                lateStreak = 0; 
            } else if (c == 'L') {
                lateStreak++;
                if (lateStreak >= 3) return false;
            } else {
                lateStreak = 0; 
            }
        }
        return true;
    }
}