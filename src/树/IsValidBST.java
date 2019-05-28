package 树;

import java.util.*;

public class IsValidBST {

    private List<Integer> ans=new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        if(root==null || (root.left==null&&root.right==null)){
            return true;
        }

        inorderRecur(root);
        for (int i = 0; i < ans.size(); i++) {
            if (i != 0) {
                if (ans.get(i-1) >= ans.get(i))
                    return false;
            }
        }
        return true;



    }

    private void inorderRecur(TreeNode root){
        if (root==null) return;
        inorderRecur(root.left);
        ans.add(root.val);
        inorderRecur(root.right);

    }
}
