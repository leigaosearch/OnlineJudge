class Solution {  
public:  
    int maxSum(TreeNode* root,int& mymax){  
        if(!root)  
            return 0;  
        int left=maxSum(root->left,mymax);  
        int right=maxSum(root->right,mymax);  
        int localmax=root->val;  
        if(left>0)  
            localmax+=left;  
        if(right>0)  
            localmax+=right;  
        mymax=max(mymax,localmax);  
        return max(root->val,max(root->val+left,root->val+right));  
    }  
    int maxPathSum(TreeNode *root) {  
        // Start typing your C/C++ solution below  
        // DO NOT write int main() function  
        int mymax=root->val;  
        int val=maxSum(root,mymax);  
        return max(mymax,val);  
    }  
};  
