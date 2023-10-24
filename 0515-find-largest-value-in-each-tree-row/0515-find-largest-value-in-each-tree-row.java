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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null)
            return l;
        int a=Integer.MIN_VALUE;
        s.add(root);
        while(!s.empty())
        {
            a=Integer.MIN_VALUE;
            Stack<TreeNode> ss=new Stack<>();
            while(!s.empty())
            {
                TreeNode n=s.pop();
                if(n==null)
                    continue;
                a=Math.max(a,n.val);
                TreeNode left=n.left;
                if(left!=null)
                    ss.add(left);
                TreeNode right=n.right;
                if(right!=null)
                    ss.add(right);
            }
            l.add(a);
            s.addAll(ss);
            ss.clear();
        }
        return l;
    }
}