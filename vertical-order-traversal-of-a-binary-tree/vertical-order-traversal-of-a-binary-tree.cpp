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
    map<int, vector<pair<int, int>>> m;
    
    void util(TreeNode *root, int distFromRoot, int depth) {
        if(!root) return;
        m[distFromRoot].push_back({depth, root->val});
        util(root->left, distFromRoot - 1, depth + 1);
        util(root->right, distFromRoot + 1, depth + 1);
    }
    
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        vector<vector<int>> res;
        util(root, 0, 0);
        for(auto &x: m) {
            sort(begin(x.second), end(x.second), [&](auto &a, auto &b) {
                if(a.first == b.first) return a.second < b.second;
                return a.first < b.first;
            });
            vector<int> temp;
            for(auto &X: x.second) {
                temp.push_back(X.second);
            }
            res.push_back(temp);
        }
        m.clear();
        return res;
    }
};