
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowest(root,p,q);
       
}
public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
    if(root==null)return null;
    if( p==root || q==root) return root;
    TreeNode left=lowest(root.left,p,q);
    TreeNode right=lowest(root.right,p,q);
    if(left != null && right!= null) return root;
    if(left !=null) return left;
    if(right != null) return right;
   return null;
}
}