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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sorted=new ArrayList<>();
        inorder(root,sorted);
        return arrange(sorted,0,sorted.size()-1);
    }
    public void inorder(TreeNode root,List<Integer> sorted){
        if(root==null)
            return;
        inorder(root.left,sorted);
        sorted.add(root.val);
        inorder(root.right,sorted);
    }
    public TreeNode arrange(List<Integer> sorted,int start,int end){
        if(start>end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(sorted.get(mid));
        node.left = arrange(sorted, start, mid - 1);
        node.right = arrange(sorted, mid + 1, end);
        return node;
    }
}