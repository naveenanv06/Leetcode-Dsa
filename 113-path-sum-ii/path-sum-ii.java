class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, targetSum, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(TreeNode root,
                     int target,
                     List<Integer> path,
                     List<List<Integer>> ans) {

        if (root == null)
            return;

        path.add(root.val);

        target -= root.val;

        if (root.left == null &&
            root.right == null &&
            target == 0) {

            ans.add(new ArrayList<>(path));
        }

        dfs(root.left, target, path, ans);
        dfs(root.right, target, path, ans);

        // Backtrack
        path.remove(path.size() - 1);
    }
}