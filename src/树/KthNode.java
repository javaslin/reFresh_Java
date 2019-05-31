package 树;

/*
二叉树的第K个节点

 */
public class KthNode {
    private TreeNode res;
    private int cnt;

    public TreeNode kThNode(TreeNode root, int k) {
        inOrder(root, k);
        return res;
    }

    private void inOrder(TreeNode root, int k) {
        if (root == null || cnt >= k) return;

        inOrder(root.left, k);
        cnt++;
        if (cnt == k) {
            res = root;
        }
        inOrder(root.right, k);
    }
}
