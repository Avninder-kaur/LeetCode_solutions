class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(1, k, n, 0, ds, ans);

        return ans;
    }

    void solve(int index, int k, int n, int sum,
               List<Integer> ds, List<List<Integer>> ans) {

        // Base case
        if (ds.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Invalid condition
        if (sum > n || index > 9) {
            return;
        }

        // Take the current number
        ds.add(index);
        solve(index + 1, k, n, sum + index, ds, ans);

        // Don't take the current number
        ds.remove(ds.size() - 1);
        solve(index + 1, k, n, sum, ds, ans);
    }
}