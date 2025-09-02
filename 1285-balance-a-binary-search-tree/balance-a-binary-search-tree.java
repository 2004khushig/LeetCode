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
    private List<TreeNode> sortedArr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return helper(0,sortedArr.size()-1);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        sortedArr.add(root);
        inorder(root.right);
    }
    public TreeNode helper(int s,int e){
        if(s>e) return null;
        int mid=(s+e)/2;
        TreeNode root=sortedArr.get(mid);
        root.left=helper(s,mid-1);
        root.right=helper(mid+1,e);
        return root;
    }
}