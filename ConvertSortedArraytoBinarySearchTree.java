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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
        if(num.length < 1) { return null; }
        
        TreeNode head = recurseToBST(num, 0, num.length-1);
        
        return head;
    }
    
    
    public TreeNode recurseToBST(int[] num, int min, int max)
    {
        if (min > max) { return null; }
        
        int mid = (min + max)/2;
        
        TreeNode n = new TreeNode(num[mid]);
        n.left = recurseToBST(num, min, mid-1);
        n.right = recurseToBST(num, mid+1, max);
        
        return n;
    }
}