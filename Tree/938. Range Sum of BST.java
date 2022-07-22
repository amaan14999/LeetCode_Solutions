//INORDER APPROACH
class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        range(root,low,high);
        return sum;
    }
    void range(TreeNode root,int low, int high)
    {
        if(root==null)
            return;
        
        
        range(root.left,low,high);
        
        if(root.val>=low&&root.val<=high)
        sum+=root.val;
        
        range(root.right,low,high);
        
    }
}
//20 lines, O(n) time, 1ms

//OPTIMISED APPROACH
class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        range(root,low,high);
        return sum;
    }
    void range(TreeNode root,int low, int high)
    {
        if(root==null)
            return;
        
        if(root.val>=low&&root.val<=high)
        sum+=root.val;
        
        if(root.val>low)
        range(root.left,low,high);
        
        if(root.val<high)
        range(root.right,low,high);
        
    }
}
//20 lines, O(n) time, 0ms
