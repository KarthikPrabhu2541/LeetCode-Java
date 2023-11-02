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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        int sumcount[]=findAverage(root);
        return count;
    }
    public int[] findAverage(TreeNode root){
        int sc[]={0,0};
        if(root==null)
            return sc;
        int left[]=findAverage(root.left);
        int right[]=findAverage(root.right);
        sc[0]=root.val+left[0]+right[0];
        sc[1]=1+left[1]+right[1];
        if((float)root.val==((sc[0])/(sc[1])))
            count++;
        return sc;
    }
}