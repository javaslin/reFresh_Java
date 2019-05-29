package 树;

public class IsSymmetric {

    public boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode root, TreeNode t2) {
        if (root == null && t2 == null) return true;
        if(root==null||t2==null) return false;
        return root.val==t2.val && isMirror(root.right,t2.left) &&
                isMirror(root.left,t2.right);
    }
}
