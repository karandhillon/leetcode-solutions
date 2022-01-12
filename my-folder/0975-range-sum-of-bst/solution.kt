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
    var sum = 0
  
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
      if (root == null) return 0
      
      if (low <= root.`val` && root.`val` <= high) sum += root.`val`
      if (low <= root.`val`) rangeSumBST(root.left, low, high)
      if (high >= root.`val`) rangeSumBST(root.right, low, high)
      
      return sum
    }
}
