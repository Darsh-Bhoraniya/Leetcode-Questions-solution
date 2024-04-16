public class Add_One_Row_to_Tree{
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null){
            return root;
        }
        if(depth==1){
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            root = temp;
        }
        if(depth-1==1){
            TreeNode temp = new TreeNode(val);
            temp.left = root.left;
            root.left = temp;
            TreeNode temp1 = new TreeNode(val);
            temp1.right = root.right;
            root.right = temp1;
        }
        addOneRow(root.left,val,depth-1);
        addOneRow(root.right,val,depth-1);
        return root;
    }
}