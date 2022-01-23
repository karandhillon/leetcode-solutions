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
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
      if (root == null) return emptyList()
      
      val output = ArrayList<ArrayList<Int>>()
      val queue = LinkedList<TreeNode>()
      queue.offer(root)
      
      var shouldReverse = false

      while (queue.isNotEmpty()) {
        val size = queue.size        
        val list = ArrayList<Int>()
        
        for (i in 0 until size) {
          val polled = queue.poll()

          list.add(polled.`val`)

          polled.left?.let { queue.offer(it) }
          polled.right?.let { queue.offer(it) }  
        }

        if (shouldReverse) list.reverse()
        shouldReverse = !shouldReverse
        
        output.add(list)
      }
      
      return output
    }
}
