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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return l;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l2=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode a=q.poll();
                l2.add(a.val);
                if(a.left!=null) q.offer(a.left);
                if(a.right!=null) q.offer(a.right);
            }
            Double sum=0.00000;
            Double avg;
            for(int i=0;i<l2.size();i++){
                sum+=l2.get(i);
            }
            
                avg=sum/l2.size();
                l.add(avg);
            
            
        }
        return l;
    }
}