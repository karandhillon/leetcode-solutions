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
    fun sumNumbers(root: TreeNode?) = dfs(root, 0)
    
    fun dfs(current: TreeNode?, sum: Int): Int {
      if (current == null) return 0
      if (current.left == null && current.right == null) return sum * 10 + current.`val`
      
      return dfs(current.left, sum * 10 + current.`val`) + dfs(current.right, sum * 10 + current.`val`)
    }
}
