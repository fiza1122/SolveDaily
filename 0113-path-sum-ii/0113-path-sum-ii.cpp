class Solution {
public:

    void dfs(TreeNode* root, int targetSum,vector<vector<int>>& ans, 
    vector<int>& path, int &sum)
    {
        if(root==NULL)
        {
            return;
        }
        
        sum+=root->val;
        path.push_back(root->val);

        if(root->left==NULL && root->right==NULL && targetSum==sum)
        {
            ans.push_back(path);
        }
        dfs(root->left,targetSum,ans,path,sum);
        dfs(root->right,targetSum,ans,path,sum);
        path.pop_back();
        sum-=root->val;
        
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {

        vector<vector<int>>ans;
        vector<int>path;
        int sum=0;
        dfs(root,targetSum,ans,path,sum);
        return ans;
    }
};