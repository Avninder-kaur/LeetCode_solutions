class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] nums, int start,
                    List<Integer> temp,
                    List<List<Integer>> ans) {

        // If size >= 2, add it
        if (temp.size() >= 2) {
            ans.add(new ArrayList<>(temp));
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate choice at this level
            if (set.contains(nums[i])) {
                continue;
            }

            // Check non-decreasing condition
            if (temp.size() > 0 && nums[i] < temp.get(temp.size() - 1)) {
                continue;
            }

            set.add(nums[i]);

            // Choose
            temp.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, temp, ans);

            // Undo choice
            temp.remove(temp.size() - 1);
        }
    }
}