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
  private var sum = 0
  
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
      if (root == null) return 0
      
      preOrderTraversal(root, low, high)
      
      return sum
    }
    
    fun preOrderTraversal(node: TreeNode?, low: Int, high: Int) {
      if (node == null) return

      if (low <= node.`val` && node.`val` <= high) sum += node.`val`
      if (low <= node.`val`) node.left?.let { preOrderTraversal(it, low, high) }
      if (node.`val` <= high) node.right?.let { preOrderTraversal(it, low, high) }
    }
}
