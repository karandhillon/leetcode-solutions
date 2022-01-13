class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
      var c = object: Comparator<Pair<Double, IntArray>> {
        override fun compare(o1: Pair<Double, IntArray>, o2: Pair<Double, IntArray>): Int {
          return if (o1.first > o2.first) -1
          else if (o1.first < o2.first) 1
          else 0
        }
      }
      var pq = PriorityQueue<Pair<Double, IntArray>>(c)
      
      for (point in points) {
        val ed = Math.sqrt(
          Math.pow(point[0].toDouble(), 2.0) + 
          Math.pow(point[1].toDouble(), 2.0)
        )
        pq.offer(Pair(ed, point))
        
        if (pq.size > k) pq.poll()
      }
      
      val output = Array<IntArray>(k) { intArrayOf() }
      for (i in 0 until k) {
        output[i] = pq.poll().second
      }
      
      return output
    }
}
