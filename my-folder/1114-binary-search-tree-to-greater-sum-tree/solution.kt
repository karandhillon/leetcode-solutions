/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
  var lastSum = 0
    fun bstToGst(root: TreeNode?): TreeNode? {
      dfs(root)
      
      return root
    }
    
    fun dfs(node: TreeNode?) {
      if (node == null) return

      dfs(node.right)
      
      node.`val` += lastSum
      lastSum = node.`val`
      
      dfs(node.left)
    }
}
