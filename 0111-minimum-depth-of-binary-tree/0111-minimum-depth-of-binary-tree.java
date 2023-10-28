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
    int depth=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        depthmin(root,1);
        return (depth==Integer.MAX_VALUE)?0:depth;
    }
    public void depthmin(TreeNode root,int i){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            depth=Math.min(depth,i);
            return;
        }
        depthmin(root.left,i+1);
        depthmin(root.right,i+1);
    }
}