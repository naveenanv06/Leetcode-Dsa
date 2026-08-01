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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode val=q.poll();
                if(val.left!=null) q.offer(val.left);
                if(val.right!=null) q.offer(val.right);
                
            }
            count++;
        }
        return count;
    }
}