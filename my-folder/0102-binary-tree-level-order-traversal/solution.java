class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
          return new ArrayList<>();
        }
    
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        List<List<Integer>> result = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int qSize = q.size();
            
            List<Integer> levelList = new ArrayList<>();
            
            for (int i = 0; i < qSize; i++) {
               TreeNode polledNode = q.poll();
               
               levelList.add(polledNode.val);
               
               if (polledNode.left != null) {
                  q.offer(polledNode.left);
               }
               
               if (polledNode.right != null) {
                  q.offer(polledNode.right);
               }
            }
            
           result.add(levelList); 
        }
        
       return result; 
    }
}
