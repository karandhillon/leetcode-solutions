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
  var diameter = 0
  
  fun diameterOfBinaryTree(root: TreeNode?): Int {
    findLongestPath(root)
    
    return diameter
  }
  
  fun findLongestPath(root: TreeNode?): Int {
    if (root == null) return 0
  
    val left = findLongestPath(root.left)
    val right = findLongestPath(root.right)
  
    diameter = Math.max(diameter, left + right)
  
    return Math.max(left, right) + 1
  }
}
