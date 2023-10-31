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
    boolean path=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int a=pathsum(root,targetSum,0);
        return path;
    }
    public int pathsum(TreeNode root, int targetSum,int sum){
        if(root==null)
            return 0;
        sum+=root.val;
        if(root.left==null && root.right==null && targetSum==sum){
            path=true;
            return 0;
        }
        int left=pathsum(root.left,targetSum,sum);
        int right=pathsum(root.right,targetSum,sum);
        return 0;
    }
}