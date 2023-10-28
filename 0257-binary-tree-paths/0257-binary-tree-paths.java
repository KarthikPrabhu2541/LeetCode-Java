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
    List<String> l=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        treepath(root,root,new String());
        return l;
    }
    public void treepath(TreeNode r,TreeNode root,String a)
    {
        if(root==null)
            return;
        a=a+((root==r)?"":"->")+(Integer.toString(root.val));
        if(root.left==null && root.right==null)
        {
            l.add(a);
            return;
        }
        treepath(r,root.left,a);
        treepath(r,root.right,a);
    }
}