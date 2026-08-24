class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0); // letter
        int row = coordinates.charAt(1) - '0'; // digit

        int colNum = col - 'a' + 1; // convert 'a'..'h' → 1..8
        return (colNum + row) % 2 == 1;
        
        
    }
}