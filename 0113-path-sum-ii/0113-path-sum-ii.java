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
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        pathsum(root,targetSum,0,new ArrayList<>());
        return l;
    }
    public void pathsum(TreeNode root, int targetSum,int sum,List<Integer> a){
        List<Integer> k=new ArrayList<>();
        k.addAll(a);
        if(root==null)
            return;
        sum+=root.val;
        k.add(root.val);
        if(root.left==null && root.right==null && targetSum==sum){
            l.add(k);
            return;
        }
        pathsum(root.left,targetSum,sum,k);
        pathsum(root.right,targetSum,sum,k);
        return;
    }
}