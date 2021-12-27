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
        if (root == null) return 0
        
        longestPath(root)
        
        return diameter
    }
    
    fun longestPath(root: TreeNode?): Int {
        if (root == null) return 0
        
        val leftPath = longestPath(root.left)
        val rightPath = longestPath(root.right)
        
        diameter = Math.max(diameter, leftPath + rightPath)
        
        return Math.max(leftPath, rightPath) + 1
    }
}
