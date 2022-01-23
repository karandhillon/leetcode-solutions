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
    fun isCompleteTree(root: TreeNode?): Boolean {
      val q = LinkedList<TreeNode?>()
      q.offer(root)
      
      while (q.peek() != null) {
        val node = q.poll()
        q.offer(node?.left)
        q.offer(node?.right)
      }
      
      while (q.isNotEmpty() && q.peek() == null) {
        q.poll()
      }
      
      return q.isEmpty()
    }
}
