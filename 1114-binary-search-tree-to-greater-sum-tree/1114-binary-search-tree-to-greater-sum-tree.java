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
    int[] gtr;
    public TreeNode bstToGst(TreeNode root) {
        gtr=new int[101];
        traverse(root);
        change(root);
        return root;
    }
    public void traverse(TreeNode root){
        if(root==null)
            return;
        for(int i=0;i<root.val;i++)
            gtr[i]+=root.val;
        traverse(root.left);
        traverse(root.right);
    }
    public void change(TreeNode root){
        if(root==null)
            return;
        root.val=root.val+gtr[root.val];
        change(root.left);
        change(root.right);
    }
}