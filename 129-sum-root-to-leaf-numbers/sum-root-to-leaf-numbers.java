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
    
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        List<Integer> l=new LinkedList<>();
        int digit=0;
        dfs(root,digit,l);
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
    private void dfs(TreeNode root,int digit,List<Integer> l){
        if(root==null) return;
        digit=digit*10+root.val;
        if(root.left==null&&root.right==null){
            l.add(digit);
            digit=0;
            return;
        }
        dfs(root.left,digit,l);
        dfs(root.right,digit,l);
    }
}