public class Binary_Tree_Postorder_Traversal {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOder(root);
        return res;
    }

    public int postOder(TreeNode root){
        if(root == null){
            return 0;
        }
        postOder(root.left);
        postOder(root.right);
        res.add(root.val);

        return    
}
