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
fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    val output = LinkedList<List<Int>>()
    val queue = LinkedList<TreeNode>()
    val stack = Stack<List<Int>>()

    return if (root == null) output
    else {
        queue.add(root)

        while (queue.isNotEmpty()) {
            val list = LinkedList<Int>()

            for (i in 0 until queue.size) {
                val polled = queue.poll()
                list.add(polled.`val`)
                polled.left?.let { queue.add(it) }
                polled.right?.let { queue.add(it) }
            }

            stack.push(list)
        }

        stack.forEach { output.addFirst(it) }

        output
    }
}
}
