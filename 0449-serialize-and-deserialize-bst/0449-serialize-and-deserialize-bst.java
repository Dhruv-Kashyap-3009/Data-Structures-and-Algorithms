/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            sb.append((node==null?"#":String.valueOf(node.val))+",");

            if(node!=null){
                q.add(node.left);
                q.add(node.right);
            }
        }

        return sb.toString().substring(0, sb.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> q = new LinkedList<>();
        int i = 0;

        String[] arr = data.split(",");

        if(arr[i].equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            TreeNode left = arr[i].equals("#")?null:new TreeNode(Integer.parseInt(arr[i]));
            i++;
            TreeNode right = arr[i].equals("#")?null:new TreeNode(Integer.parseInt(arr[i]));
            i++;

            node.left = left;
            node.right = right;

            if(left!=null) q.add(left);
            if(right!=null) q.add(right);
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;