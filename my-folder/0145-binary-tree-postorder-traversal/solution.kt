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
        val output = ArrayList<Int>()

        if (root == null) {
            return output
        }

        val stackA: Stack<TreeNode> = Stack()
        val stackB: Stack<TreeNode> = Stack()

        stackA.push(root)

        while (stackA.isNotEmpty()) {
            val node = stackA.pop()

            stackB.push(node)

            node.left?.let { stackA.push(it) }
            node.right?.let { stackA.push(it) }
        }


        while (stackB.isNotEmpty()) {
            output.add(stackB.pop().`val`)
        }

        return output
    }
}
