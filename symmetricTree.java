/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null) { return true; }
        else if((root.left == null) && (root.right == null)) { return true; }
        else {
            return checkSymmetric(root.left, root.right);
        }
        
    }
    
    public boolean checkSymmetric(TreeNode n, TreeNode m)
    {
        if((n == null) && (m == null)) { return true; }
        else if((n == null) && (m != null)) { return false; }
        else if((n != null) && (m == null)) { return false; }
        else if(m.val != n.val) { return false; }
        else{
            
            return (checkSymmetric(n.left,m.right) && checkSymmetric(n.right,m.left));
        }
        
    }
}
