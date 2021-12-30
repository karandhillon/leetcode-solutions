class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
          return null;
        }
        
        return lca(root, p, q);
    }
    
    private TreeNode lca(TreeNode node, TreeNode p, TreeNode q) {
      if (node.left == null && node.right == null) {
        return node == p || node == q ? node : null;
      }
      
      boolean isNodePresent = node == p || node == q;
      
      TreeNode leftLca = null;
      TreeNode rightLca = null;
      
      if (node.left != null) {
        leftLca = lca(node.left, p, q);
      }
      
      if (node.right != null) {
        rightLca = lca(node.right, p, q);
      }
      
      if (leftLca != null && rightLca != null) {
        return node;
      }
      
      if (isNodePresent) {
        return node;
      }
      
      return leftLca != null ? leftLca : rightLca;
    }
}
