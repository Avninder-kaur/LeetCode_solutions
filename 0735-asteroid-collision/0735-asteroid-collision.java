class Solution {
    public int[] asteroidCollision(int[] asteriods) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteriods.length; i++) {
            boolean isalive = true;
            while (isalive && !st.isEmpty() && (st.peek() > 0 && asteriods[i] < 0)) {
                if (-asteriods[i] < st.peek()) {
                    isalive = false;
                    break;
                }
                if (-asteriods[i] == st.peek()) {
                    st.pop();
                    isalive = false;
                    break;
                }
                if (-asteriods[i] > st.peek()) {
                    st.pop();
                    continue;
                }
            }
            if (isalive) {
                st.push(asteriods[i]);
            }
        }
        int[] ans = new int[st.size()];
        while (!st.isEmpty()) {
            for (int i = st.size() - 1; i >= 0; i--) {
                ans[i] = st.pop();
            }
        }

        return ans;
    }
}