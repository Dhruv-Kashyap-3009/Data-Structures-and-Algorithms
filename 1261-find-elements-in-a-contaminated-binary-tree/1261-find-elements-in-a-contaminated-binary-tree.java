/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    TreeNode root;
    public FindElements(TreeNode Root) {
        changeTree(Root);
        root = Root;
    }
    
    public boolean find(int target) {
        return findTarget(root, target);
    }

    private void changeTree(TreeNode root){
        if(root==null) return;
        if(root.val==-1){
            root.val=0;
        }

        if(root.left!=null) root.left.val = 2*(root.val) +1;
        if(root.right!=null) root.right.val = 2*(root.val) +2;

        changeTree(root.left);
        changeTree(root.right);
    }

    private boolean findTarget(TreeNode root, int target){
        if(root==null) return false;
        if(root.val == target) return true;

        return findTarget(root.left, target) || findTarget(root.right, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */