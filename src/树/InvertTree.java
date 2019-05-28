package 树;

public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if(root==null) return root;

        TreeNode t=root.right;
        root.right=root.left;
        root.left=t;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
