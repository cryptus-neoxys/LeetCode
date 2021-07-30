/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int val;
    int res;
    void fun(TreeNode *root, int &val)
    {
        if(root==NULL)
            return ;
        fun(root->left, val);
        val--;
        if(val==0)
            res=root->val;
        fun(root->right, val);
    }
    int kthSmallest(TreeNode* root, int k) {
        val=k;
        fun(root, val);
        return res;        
    }
};