class Solution {
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.right);      // go right first
        sum += node.val;           // update running sum
        node.val = sum;            // assign new value
        traverse(node.left);       // then go left
    }
}
