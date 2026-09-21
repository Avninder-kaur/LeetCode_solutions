import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int[] arr, int target, int index,
               List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Skip duplicate values at the same level
            if (i > index && arr[i] == arr[i - 1])
                continue;

            // Since array is sorted
            if (arr[i] > target)
                break;

            temp.add(arr[i]);

            // i + 1 because each element can be used only once
            solve(arr, target - arr[i], i + 1, temp, ans);

            temp.remove(temp.size() - 1);
        }
    }
}