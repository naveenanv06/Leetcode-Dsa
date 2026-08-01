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
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
         return dfs(root,(long)targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        
    }
    private int dfs(TreeNode root,long t){
        if(root==null) return 0;
        int c=0;
        if(root.val==t) c++;
        c+=dfs(root.left,t-root.val);
        c+=dfs(root.right,t-root.val);
        return c;
    }
}