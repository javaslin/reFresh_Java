package 树;

public class IsBalance {
    private boolean res=true;
    public boolean isBalance(TreeNode head){
        maxDepth(head);
        return res;

    }
    private int maxDepth(TreeNode head){
        if(head==null) return 0;
        int l=maxDepth(head.left);
        int r=maxDepth(head.right);
        if(Math.abs(l-r)>1) res=false;
        return Math.max(l,r)+1;
    }
}
