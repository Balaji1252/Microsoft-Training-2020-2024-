class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return  tree(0,nums.length-1,nums);
    }
    public TreeNode tree(int l,int r,int[] nums){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=tree(l,mid-1,nums);
        root.right=tree(mid+1,r,nums);
        return root;
    }
}
