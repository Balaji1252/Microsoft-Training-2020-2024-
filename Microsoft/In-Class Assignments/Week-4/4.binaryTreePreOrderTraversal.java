import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return result;
        if(root.left!=null)
            postorderTraversal(root.left);
        if(root.right!=null)
            postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }
}
