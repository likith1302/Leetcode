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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rot=preorder(root);
        String sub=preorder(subRoot);
        return rot.contains(sub);
        
    }
    public String preorder(TreeNode node){
        if(node==null) return "(#)";
        return "("+node.val+")"+preorder(node.left)+preorder(node.right);
    }
}