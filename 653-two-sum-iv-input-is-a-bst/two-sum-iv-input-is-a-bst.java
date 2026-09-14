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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> pre=new ArrayList<>();
        preorder(root,pre);
        HashSet<Integer> seen=new HashSet<>();
        for(int num:pre){
            if(seen.contains(k-num)) return true;
            seen.add(num);
        }
        return false;
        
    }
    public void preorder(TreeNode node,ArrayList<Integer> pre){
        if(node==null) return;
        pre.add(node.val);
        preorder(node.left,pre);
        preorder(node.right,pre);
    }
}