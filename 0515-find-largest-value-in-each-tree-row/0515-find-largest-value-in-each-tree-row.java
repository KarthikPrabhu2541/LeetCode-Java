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
    List<Integer> l=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        maxlevel(root,0);
        return l;
    }
    void maxlevel(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(l.size()>level)
            l.set(level,Math.max(l.get(level),root.val));
        else
            l.add(root.val);
        maxlevel(root.left,level+1);
        maxlevel(root.right,level+1);
    }
}