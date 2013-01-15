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
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
    if(root == null) {return 0;}
    else
    {
        return calculateMinDepth(root);
        
    }

        
    }
    
    public int calculateMinDepth(TreeNode root)
    {
            
        if(root == null) { return 32767; }
        else if(root.right == null)
        {
        
            if(root.left == null) { return 1; }            
        }

      
        return (1 + Math.min(calculateMinDepth(root.left), calculateMinDepth(root.right)));
    }

        
}
