/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        
        //traversal in the tree
        TreeNode left= invertTree(root.left);
        TreeNode right= invertTree(root.right);
        
        //Swaping
        root.right=left;
        root.left=right;
        
        return root;
    }
}
//31 lines, O(n) time, O(n) space
