/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
            = new TreeMap<>();

        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<int[]> positions = new LinkedList<>();

        nodes.offer(root);
        positions.offer(new int[]{0, 0});

        while (!nodes.isEmpty()) {

            TreeNode curr = nodes.poll();
            int[] pos = positions.poll();

            int row = pos[0];
            int col = pos[1];

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());

            map.get(col).get(row).offer(curr.val);

            if (curr.left != null) {
                nodes.offer(curr.left);
                positions.offer(new int[]{row + 1, col - 1});
            }

            if (curr.right != null) {
                nodes.offer(curr.right);
                positions.offer(new int[]{row + 1, col + 1});
            }
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> column = new ArrayList<>();

            for (PriorityQueue<Integer> values : rows.values()) {

                while (!values.isEmpty()) {
                    column.add(values.poll());
                }
            }

            ans.add(column);
        }

        return ans;
    }
}