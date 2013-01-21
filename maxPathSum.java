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
    public int maxPathSum(TreeNode root) {
       // Start typing your C/C++ solution below  
        // DO NOT write int main() function 
        if((root.left == null) && (root.right == null)) {return root.val;}
        
        int globalMax=root.val;  
        int val = maxSum(root,globalMax);  
        return Math.max(globalMax,val);  
        
    }
    
   public int maxSum(TreeNode root, int globalMax){  
        if(root == null)  
            return 0;  
  
    int localMax = root.val;
  
    int left = pathSum(root.left);
    
    if(left > 0) { localMax += left; }
    
    int right = pathSum(root.right);
    
    if(right > 0) { localMax += right; }
    
    if(localMax > globalMax) { globalMax = localMax; }
    
    return Math.max(globalMax, Math.max(maxSum(root.left,globalMax), maxSum(root.right,globalMax)));
  
  
    }  
    
    
    public int pathSum(TreeNode root)
    {
        if(root == null) { return 0; }
        
        return Math.max(root.val, Math.max(root.val+pathSum(root.left), root.val+pathSum(root.right)));
    }


}
