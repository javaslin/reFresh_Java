public class S3 {
    class Node {
        Node left, right;
        int data;
        Node(int newData) {
            left = right = null;
            data = newData;
        }
    }
    private static int isPresent(Node root, int val){
        if(root.data  == val){
            return 1;
        }
        if(root.data > val){

            if(root.left == null){
                return 0;
            }else{
                isPresent(root.left, val);
            }
        }else{

            if(root.right == null){
                return 0;
            }else{
                isPresent(root.right, val);
            }
        }
        return 0;



    }
}
