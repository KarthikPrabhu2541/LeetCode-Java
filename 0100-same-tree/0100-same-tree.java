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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null){
            if(q!=null){
                return false;
            }
            return true;
        }
        else if(q==null)
            return false;
        if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)&&p.val==q.val)
            return true;
        else
            return false;
    }
}