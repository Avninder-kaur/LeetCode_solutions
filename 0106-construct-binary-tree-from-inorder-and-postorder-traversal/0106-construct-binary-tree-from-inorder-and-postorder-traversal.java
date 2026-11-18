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
    int postindex=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postindex=postorder.length-1;
        return build(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode build(int[] inorder, int[] postorder,int left,int right){
if(left>right){
    return null;
}
int rootval=postorder[postindex];
postindex--;
int inidx=0;
while(rootval != inorder[inidx]){
    inidx++;
}
TreeNode root=new TreeNode(rootval);
root.right=build(inorder,postorder,inidx+1,right);
root.left=build(inorder,postorder,left,inidx-1);

return root;
    }
}