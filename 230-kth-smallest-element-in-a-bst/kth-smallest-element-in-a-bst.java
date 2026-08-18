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
    ArrayList<Integer> roots=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return roots.get(k-1);

    }
    public void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        roots.add(node.val);
        inorder(node.right);
    }
}