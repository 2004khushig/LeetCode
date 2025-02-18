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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return false;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        boolean evenLevel=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            int prev=evenLevel?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                int val=curr.val;
                if((evenLevel && val%2==0)||(!evenLevel && val%2==1)){
                    return false;
                }
                if((evenLevel && val<=prev)||(!evenLevel && val>=prev)){
                    return false;
                }
                prev=val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            evenLevel=!evenLevel;

        }
        return true;
    }
}