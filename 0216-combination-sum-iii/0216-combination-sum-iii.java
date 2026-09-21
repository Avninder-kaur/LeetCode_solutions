import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(1, k, n, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int start, int k, int n,
               List<Integer> list,
               List<List<Integer>> ans) {

        // We found a valid combination
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Invalid case
        if (k == 0 || n < 0) {
            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {

            // Choose i
            list.add(i);

            // Recursion
            solve(i + 1, k - 1, n - i, list, ans);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}