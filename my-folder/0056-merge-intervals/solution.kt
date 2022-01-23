class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
      if (intervals.size == 0) return arrayOf<IntArray>()
      
      val output = ArrayList<IntArray>()
      
      val c = object: Comparator<IntArray> {
        override fun compare(o1: IntArray, o2: IntArray): Int {
          return if (o1[0] > o2[0]) 1
          else if (o1[0] < o2[0]) -1
          else 0
        }
      }
      intervals.sortWith(c)
      
      for (interval in intervals) {
        if (output.isEmpty()) output.add(interval)
        else {
          val last = output.last()
          val ls = last.get(0)
          val le = last.get(1)
          
          val s = interval.get(0)
          val e = interval.get(1)
          
          if (le >= s) {
            output.removeAt(output.size - 1)
            output.add(intArrayOf(ls, Math.max(le, e)))
          } 
          else output.add(interval)
        }
      }
      
      return output.toTypedArray()
    }
}
