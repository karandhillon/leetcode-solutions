class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      
      dfs(root, 0, result);  
      
      return result;
    }
    
    private void dfs(TreeNode node, int level, List<Integer> result) {
      if (node == null) {
        return;
      }
      
      if (level >= result.size()) {
        result.add(node.val);
      } else {
        result.set(level, node.val);
      }
      
      dfs(node.left, level + 1, result);
      dfs(node.right, level + 1, result);
    }
}
