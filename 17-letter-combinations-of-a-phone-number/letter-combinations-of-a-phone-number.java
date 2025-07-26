class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        Map<Character, String> keypad = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, "", result, keypad);
        return result;
    }

    private void backtrack(String digits, int idx, String current, List<String> result, Map<Character, String> keypad) {
        if (idx == digits.length()) {
            result.add(current);
            return;
        }

        String letters = keypad.get(digits.charAt(idx));
        for (char ch : letters.toCharArray()) {
            backtrack(digits, idx + 1, current + ch, result, keypad);
        }
    }
}