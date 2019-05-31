package 树;

public class MaxDepth {

    public int maxDepth(TreeNode head) {
        if (head == null) return 0;
        return Math.max(maxDepth(head.left), maxDepth(head.right)) + 1;
    }
}
