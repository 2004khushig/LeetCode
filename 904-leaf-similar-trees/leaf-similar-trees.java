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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>forR1=new ArrayList<>();
        List<Integer>forR2=new ArrayList<>();
        helper(root1,forR1);
        helper(root2,forR2);
        return forR1.equals(forR2);
    }
    public void helper(TreeNode root,List<Integer>leaf){
        if(root==null) return;
        if(root.left==null && root.right==null){
            leaf.add(root.val);
        }
        helper(root.left,leaf);
        helper(root.right,leaf);
    }
}