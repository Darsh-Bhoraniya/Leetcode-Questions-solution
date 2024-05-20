/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Distribute_Coins_in_Binary_Tree{
    public int distributeCoins(TreeNode root) {
        TreeNode dummy = new TreeNode();
        return dfs(root, dummy);
    }

    private int dfs(TreeNode cur_node, TreeNode parent) {
        if (cur_node == null) {
            return 0;
        }
        int moves = dfs(cur_node.left, cur_node) + dfs(cur_node.right, cur_node);
        int from_this = cur_node.val - 1;
        parent.val += from_this;
        moves += Math.abs(from_this);
        return moves;
    }
}
