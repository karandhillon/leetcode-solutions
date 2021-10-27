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
    fun preorderTraversal(root: TreeNode?): List<Int> {
    val stack = Stack<TreeNode>()
    val output = ArrayList<Int>()
    
    return if (root == null) output
    else {
        stack.push(root)
        
        while (stack.isNotEmpty()) {
            val popped = stack.pop()
            output.add(popped.`val`)
            popped.right?.let { stack.push(it) }
            popped.left?.let { stack.push(it) }
        }
        
        output
    }
}
}
