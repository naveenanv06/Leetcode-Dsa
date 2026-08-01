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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        if(root==null) return l;
    
        dfs(root,"",l);
        return l;
    }
    private void dfs(TreeNode root,String p,List<String> l){
            if(root==null) return;
            if (p.length()==0) p=""+root.val;
            else p=p+"->"+root.val;
            if(root.left==null&&root.right==null) {
                l.add(p);
                return;
            }
            dfs(root.left,p,l);
            dfs(root.right,p,l);
    }
}