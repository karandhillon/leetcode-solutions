class Solution {
  var lca: TreeNode? = null
  
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      if (root == null) return null
      
      helper(root, p, q)
      
      return lca
    }
    
    fun helper(node: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
      if (node == null) return false
      
      val isNodeMatch = if (node.`val` == p!!.`val` || node.`val` == q!!.`val`) true else false
      val isLeftMatch = helper(node.left, p, q)
      val isRightMatch = helper(node.right, p, q)
      
      if (isLeftMatch && isRightMatch) {
        lca = node
        return true
      }
      
      if (isNodeMatch && (isLeftMatch || isRightMatch)) {
        lca = node
      }
      
      if (isLeftMatch || isRightMatch || isNodeMatch) {
        return true
      }

      return false
    }
}
