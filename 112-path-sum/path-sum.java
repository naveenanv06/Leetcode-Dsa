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
    public boolean hasPathSum(TreeNode root, int targetsum) {
        if(root==null) return false;
        targetsum-=root.val;
        if(root.left==null&&root.right==null) return targetsum==0;
        return hasPathSum(root.left,targetsum)||hasPathSum(root.right,targetsum);
    }
}