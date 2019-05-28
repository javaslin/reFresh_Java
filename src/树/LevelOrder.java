package 树;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void printByLevel(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        TreeNode last = head;
        TreeNode nLast = null;
        queue.offer(head);
        System.out.print("Level " + (level++) + " : ");
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.val + " ");
            if (head.left != null) {
                queue.offer(head.left);
                nLast = head.left;
            }
            if (head.right != null) {
                queue.offer(head.right);
                nLast = head.right;
            }
            if (head == last && !queue.isEmpty()) {
                System.out.print("\nLevel " + (level++) + " : ");
                last = nLast;
            }
        }

    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.right.left = new TreeNode(5);
        head.right.right = new TreeNode(6);
        head.right.left.left = new TreeNode(7);
        head.right.left.right = new TreeNode(8);


        System.out.println("===============");
        printByLevel(head);
    }
}
