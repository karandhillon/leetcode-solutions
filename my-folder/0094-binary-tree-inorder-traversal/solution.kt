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
        val output = ArrayList<Int>()

        if (root == null) return output

        var curr = root
        val stack = Stack<TreeNode>()

        while (curr != null || stack.isNotEmpty()) {
            while (curr != null) {
                stack.push(curr)
                
                curr = curr.left
            }

            curr = stack.pop()
            output.add(curr.`val`)
            curr = curr.right
        }

        return output
    }
}
