package 树;
/*
树的直径 -一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
应该是求所有节点中左子树+右子树的最大值
 */
public class DiameterOfBinaryTree {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode head){
        if(head==null) return 0;
        maxDepth(head);
        return max;
    }
    private int maxDepth(TreeNode head){
        if(head==null) return 0;
        int l=maxDepth(head.left);
        int r=maxDepth(head.right);
        max=Math.max(max,l+r);
        return Math.max (l,r)+1;
    }
}
