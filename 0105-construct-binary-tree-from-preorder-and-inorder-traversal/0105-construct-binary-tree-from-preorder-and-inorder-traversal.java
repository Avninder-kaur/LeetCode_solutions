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
    int rootpointer=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int[] inorder,int left,int right){
        if(left>right){
            return null;
        }
        int inorderindex=left;
        int rootval=preorder[rootpointer];
        rootpointer++;
        while(rootval != inorder[inorderindex]){
inorderindex++;
        }
        TreeNode root=new TreeNode(rootval);
        root.left=build(preorder,inorder,left,inorderindex-1);
        root.right=build(preorder,inorder,inorderindex+1,right);
        return root;
    }
}