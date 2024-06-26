public class Binary_Search_Tree_to_Greater_Sum_Tree() {
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {  
        if (root != null) {
            bstToGst(root.right);  // Traverse the right subtree
            sum += root.val;  // Update the sum
            root.val = sum;  // Update the current node's value
            bstToGst(root.left);  // Traverse the left subtree
        }
        return root;
    }
}