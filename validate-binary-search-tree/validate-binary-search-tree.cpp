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
    private: bool isValid;
    private: TreeNode *pre;
    public: bool isValidBST(TreeNode* root) {
        isValid = true;
        inord(root);
        return isValid;
    }
    
    public: void inord(TreeNode *root) {
        if (root == NULL) return;
        inord(root->left);
        if(pre != NULL && pre->val >= root->val) {
            isValid = false; return;
        }
        pre = root;
        inord(root->right);
    }
};