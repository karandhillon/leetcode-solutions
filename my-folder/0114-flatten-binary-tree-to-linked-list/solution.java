class Solution {
    public void flatten(TreeNode root) {
    if (root == null) {
     return;
    }
    
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    
    while (!stack.isEmpty()) {
       TreeNode poppedNode = stack.pop();
       
       if (poppedNode.right != null) {
          stack.push(poppedNode.right);
       }
       
       if (poppedNode.left != null) {
          stack.push(poppedNode.left);
          poppedNode.left = null;
       }
       
       if (!stack.isEmpty()) poppedNode.right = stack.peek();
    }
    }
}
