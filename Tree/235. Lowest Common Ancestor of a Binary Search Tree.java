//RECURSIVE APPROACH
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
//11 lines, O(N) time, 4ms

//ITERATIVE APPROACH
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true)
        {
            if(root.val>p.val && root.val>q.val)
                root=root.left;
            else if(root.val<p.val && root.val<q.val)
                root=root.right;
            else
                return root;
        }
    }
}
//12 lines, O(N) time, 6ms
