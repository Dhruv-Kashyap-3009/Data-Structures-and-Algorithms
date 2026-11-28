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
class CBTInserter {
    TreeNode root;
    public CBTInserter(TreeNode Root) {
        root = Root;
    }
    
    public int insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if(root==null){
            root = newNode;
            return root.val;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node.left==null){
                node.left = newNode;
                return node.val;
            }

            if(node.right==null){
                node.right = newNode;
                return node.val;
            }

            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
        }

        return -1;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */