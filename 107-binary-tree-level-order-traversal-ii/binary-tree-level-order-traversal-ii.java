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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue <TreeNode> level=new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            int n=level.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=level.poll();
                l.add(node.val);
                if(node.left!=null) level.add(node.left);
                if(node.right!=null) level.add(node.right);
            }
            ans.addFirst(l);
        }
        return ans;
    }
}