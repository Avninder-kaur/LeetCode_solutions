class Solution {

    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "", ans);

        return ans;
    }

    void backtrack(String digits, int index,
                   String current, List<String> ans) {

        // All digits processed
        if(index == digits.length()) {
            ans.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = map[digit];

        for(int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            backtrack(
                digits,
                index + 1,
                current + ch,
                ans
            );
        }
    }
}