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
fun inorderTraversal(root: TreeNode?): List<Int> {
    val stack = Stack<TreeNode>()
    val output = ArrayList<Int>()

    return if (root == null) output
    else {
        var current: TreeNode? = root

        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.push(current)
                current = current.left
            }

            val popped = stack.pop()
            output.add(popped.`val`)
            current = popped.right

        }

        output
    }
}
}
