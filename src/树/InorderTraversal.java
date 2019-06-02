package 树;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    private static List<Integer> ans = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        inorderRecur(root);
        return ans;
    }

    private static void inorderRecur(TreeNode root) {
        if (root == null) return;
        inorderRecur(root.left);
        ans.add(root.val);
        inorderRecur(root.right);

    }
    private static void hapRecur(TreeNode root){//先序遍历
        if (root == null) return;
        ans.add(root.val);
        hapRecur(root.left);
        hapRecur(root.right);
    }
    private static void endRecur(TreeNode root){//后序遍历
        if (root == null) return;
        endRecur(root.left);
        endRecur(root.right);
        ans.add(root.val);
    }



    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(4);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(9);
        root.left.right=new TreeNode(6);
        root.right.right=new TreeNode(3);
        root.right.left=new TreeNode(2);
        root.left.left.left=new TreeNode(10);
        inorderRecur(root);
        System.out.println(ans);

    }
}
