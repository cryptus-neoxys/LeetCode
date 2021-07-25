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
    int diameterOfBinaryTree(TreeNode* root) {
        int h = 0;
        dia(root, h);
        return h;
    }
    int dia(TreeNode *r, int &h) {
        if(r == NULL) return 0;
//         Left height
        int L = dia(r->left, h);
//         Right Height
        int R = dia(r->right, h);
//         Max Height
        h = max(h, L+R);
//         Return Max Height
        return max(L,R) + 1;
    }
};