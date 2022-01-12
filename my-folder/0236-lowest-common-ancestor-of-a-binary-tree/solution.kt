/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
  lateinit var lca: TreeNode
    
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      isNodePresent(root, p, q)
      
      return lca
    }
    
    fun isNodePresent(
      node: TreeNode?,
      p: TreeNode?,
      q: TreeNode?
    ): Boolean {
      if (node == null) return false
      
      val atNode = if (node.`val` == p?.`val` || node.`val` == q?.`val`) true else false
      val left = isNodePresent(node.left, p, q)
      val right = isNodePresent(node.right, p, q)
      
      if (left && right) { lca = node }
      if (atNode && left || atNode && right) { lca = node }
      
      return if (atNode || left || right) true else false
    }
}
