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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer>curr=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode c=q.poll();
                curr.add(c.val);
                if(c.left!=null){
                    q.offer(c.left);
                }
                if(c.right!=null){
                    q.offer(c.right);
                }
            }
            result.add(curr);
        }
        return result;

    }
}