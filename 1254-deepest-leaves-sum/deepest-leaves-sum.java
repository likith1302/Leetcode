class Solution {
    int maxDepth = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        // Leaf node
        if (node.left == null && node.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                sum = node.val; // reset sum for new deepest level
            } else if (depth == maxDepth) {
                sum += node.val; // add to sum if same deepest level
            }
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
