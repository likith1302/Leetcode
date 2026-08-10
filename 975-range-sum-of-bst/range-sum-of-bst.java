class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = 0;

        // If current node is within range, include it
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        // Explore left subtree only if values could be >= low
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }

        // Explore right subtree only if values could be <= high
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}
