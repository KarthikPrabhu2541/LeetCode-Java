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
    public boolean isBalanced(TreeNode root) {
        int h=height(root,1);
        if(h!=-1)
            return true;
        return false;
    }
    public int height(TreeNode root,int i){
        if(root==null)
            return i-1;
        if(root.left==null && root.right==null)
            return i;
        int left=height(root.left,i+1);
        int right=height(root.right,i+1);
        if(Math.abs(left-right)<=1){
            return Math.max(left,right);
        }
        return -1;
    }
}