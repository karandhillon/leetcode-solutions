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
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        
        val list = ArrayList<Int>()
        val q = LinkedList<TreeNode>()
        q.offer(root)
        
        while(q.isNotEmpty()) {
          val qSize = q.size
          for (i in 0 until qSize) {
            val polled = q.poll()
                      
            polled.left?.let { q.offer(it) }
            polled.right?.let { q.offer(it) }
            
            if (i == qSize-1) { list.add(polled.`val`) }
          }
        }
        
        return list
    }
}
