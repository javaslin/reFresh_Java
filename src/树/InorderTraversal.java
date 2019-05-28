package 树;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    private List<Integer> ans=new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root){
        inorderRecur(root);
        return ans;
    }
    private void inorderRecur(TreeNode root){
        if (root==null) return;
        inorderRecur(root.left);
        ans.add(root.val);
        inorderRecur(root.right);

    }
}
