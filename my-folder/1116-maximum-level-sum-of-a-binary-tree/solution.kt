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
    fun maxLevelSum(root: TreeNode?): Int {
      if (root == null) return 0
      
      val map = HashMap<Int, Int>()
      val queue = LinkedList<TreeNode>()
      queue.offer(root)
      
      var level = 1

      while (queue.isNotEmpty()) {
        val size = queue.size
        var levelSum = 0

        for (i in 0 until size) {
          val polled = queue.poll()
          
          levelSum += polled.`val`
          
          polled.left?.let { queue.offer(it) }
          polled.right?.let { queue.offer(it) }          
        }
        
        map.put(level++, levelSum)
      }
      
      var pair = Pair(Int.MAX_VALUE, Int.MIN_VALUE)
      for ((level, sum) in map) {
        println("level: $level sum: $sum")
        
        if (sum > pair.second) pair = Pair(level, sum)
        else if (sum == pair.second) pair = Pair(Math.min(level, pair.first), sum)
      }
      
      return pair.first
    }
}
