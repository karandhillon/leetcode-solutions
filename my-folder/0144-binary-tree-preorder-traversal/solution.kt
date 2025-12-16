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
        val output = ArrayList<Int>()

        if (root == null) {
            return output
        }

        var curr = root
        val stack = Stack<TreeNode>()

        while (stack.isNotEmpty() || curr != null) {
            while (curr != null) {
                output.add(curr.`val`)
                stack.push(curr.right)
                curr = curr.left
            }

            curr = stack.pop()
        }

        return output
    }
}
