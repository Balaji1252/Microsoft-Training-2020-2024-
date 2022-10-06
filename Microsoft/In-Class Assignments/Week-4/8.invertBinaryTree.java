class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        else if(root.left==null&&root.right==null)
        {
            return root;
        }
        TreeNode m=invertTree(root.left);
        TreeNode n=invertTree(root.right);
        root.left=n;
        root.right=m;
        return root;
    }
}
