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

class Solution {  
    public boolean isEqual(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        } else if(root1!=null && root2!=null && root1.val == root2.val) {
            return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
        } else return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isEqual(root, subRoot)) {
            return true;
        }
        if(root == null && subRoot != null) {
            return false;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
