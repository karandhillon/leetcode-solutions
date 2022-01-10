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
    var max = Int.MIN_VALUE
    
    fun maxPathSum(root: TreeNode?): Int {
        dfs(root)
        
        return max
    }

    fun dfs(node: TreeNode?): Int {
        if (node == null) return 0
        
        val l = Math.max(dfs(node.left), 0)
        val r = Math.max(dfs(node.right), 0)
        
        val pathSum = l + r + node.`val`
        max = Math.max(max, pathSum)
        
        return node.`val` + Math.max(l, r)
    }
}
