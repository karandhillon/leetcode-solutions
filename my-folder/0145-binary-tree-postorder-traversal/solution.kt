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
fun postorderTraversal(root: TreeNode?): List<Int> {
    val stack = Stack<TreeNode>()
    val output = LinkedList<Int>()

    return if (root == null) output
    else {
        stack.push(root)

        while (stack.isNotEmpty()) {
            val popped = stack.pop()
            output.addFirst(popped.`val`)
            popped.left?.let { stack.push(it) }
            popped.right?.let { stack.push(it) }
        }

        output
    }
}
}
