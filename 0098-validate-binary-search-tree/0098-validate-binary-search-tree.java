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
    private long minval=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
if(!isValidBST(root.left)) return false;
if(minval>=root.val) return false;
minval=root.val;
if(!isValidBST(root.right)) return false;
return true;
    }
}