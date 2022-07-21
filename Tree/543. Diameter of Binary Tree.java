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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxdepth(root);
        return max;
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        int leftht=maxdepth(root.left);
        int rightht=maxdepth(root.right);
        
        max=Math.max(max,leftht+rightht);
        
        return 1+ Math.max(leftht,rightht);
    }
}
//32 lines, O(n) time
