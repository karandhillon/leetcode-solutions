/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      if (root == null) return null
      if (root!!.`val` == p!!.`val` || root!!.`val` == q!!.`val`) return root
      
      val leftResult = lowestCommonAncestor(root.left, p, q)
      val rightResult = lowestCommonAncestor(root.right, p, q)
      
      if (leftResult == null) return rightResult
      if (rightResult == null) return leftResult
      
      return root
    }
}
