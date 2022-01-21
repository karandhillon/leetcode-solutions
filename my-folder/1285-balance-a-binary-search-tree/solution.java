class Solution {
    public TreeNode balanceBST(TreeNode root) {
      List<TreeNode> list = new ArrayList<>();
      
      inorder(root, list);   
      
      return build(root, list, 0, list.size() - 1);
    }
    
    private TreeNode build(TreeNode root, List<TreeNode> list, int start, int end) {
      if (start > end) {
        return null;
      }
      
      if (start == end) {
        return list.get(start);
      }
      
      int mid = start + (end - start) / 2;
      
      TreeNode treeNode = list.get(mid);
      treeNode.left = build(root, list, start, mid - 1);
      treeNode.right = build(root, list, mid + 1, end);
      
      return treeNode;
    }
    
    private void inorder(TreeNode node, List<TreeNode> list) {
      if (node == null) {
        return;
      }
      
      inorder(node.left, list);
      
      TreeNode rightNode = node.right;
      node.left = null;
      node.right = null;
      
      list.add(node);
      
      inorder(rightNode, list);
    }
}
