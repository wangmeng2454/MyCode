/**
 * @Description: 1080. 根到叶路径上的不足节点
 * @CreateDate: 2023/5/22
 */


public class No1080SufficientSubset {

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return dfs(root, limit, 0);
    }

    private TreeNode dfs(TreeNode root, int limit, int sum) {
        if (root == null) {
            return null;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum >= limit) {
                return root;
            } else {
                //该叶子节点为不足节点，进行删除
                return null;
            }
        }
        root.left = dfs(root.left, limit, sum);
        root.right = dfs(root.right, limit, sum);

        // 说明通过当前节点的所有路径和都小于limit，进行删除
        if (root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}

