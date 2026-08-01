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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return l;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l2=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode ro=q.poll();
                l2.add(ro.val);
                if(ro.left!=null) q.offer(ro.left);
                if(ro.right!=null) q.offer(ro.right); 
            }
            l.add(l2);
        } 
        return l;
    }
}