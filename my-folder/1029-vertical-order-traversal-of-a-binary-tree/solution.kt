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
    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
      if (root == null) return emptyList()
      
      val q = LinkedList<Triple<TreeNode, Int, Int>>()
      q.offer(Triple(root, 0, 0))

      val map = HashMap<Int, PriorityQueue<Pair<Int, Int>>>()
      var minKey = Int.MAX_VALUE
      var maxKey = Int.MIN_VALUE
       
      while (q.isNotEmpty()) {
        val qs = q.size
  
        for (i in 0 until qs) {
          val polled = q.poll()
          val node = polled.first
          val row = polled.second
          val col = polled.third
          
          minKey = Math.min(minKey, col)
          maxKey = Math.max(maxKey, col)
          
          val c = object: Comparator<Pair<Int, Int>> {
            override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
              return if (o1.first > o2.first) 1
              else if (o1.first < o2.first) -1
              else {
                if (o1.second > o2.second) 1
                else if (o1.second < o2.second) -1
                else 0
              }
            }
          }
          
          map.getOrPut(col) { PriorityQueue(c) }.offer(Pair(row, node.`val`))
          node.left?.let { q.offer(Triple(it, row+1, col-1)) }
          node.right?.let { q.offer(Triple(it, row+1, col+1)) }
        }
      }
      
      val output = ArrayList<List<Int>>()
      for (key in minKey until maxKey+1) {
        val list = ArrayList<Int>()
        val pq = map.get(key)!!
        
        while(pq.isNotEmpty()) { 
          list.add(pq.poll().second) 
        }
        
        output.add(list)
      }
      
      return output
    }
}
