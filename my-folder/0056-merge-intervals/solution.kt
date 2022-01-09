class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
      val c = object: Comparator<IntArray> {
        override fun compare(o1: IntArray, o2: IntArray): Int {
          return if (o1[0] > o2[0]) 1
          else if (o1[0] < o2[0]) -1
          else 0
        }
      }
      val newIntervals: List<IntArray> = intervals.sortedWith(c)
      
      val output = ArrayList<IntArray>()
      output.add(newIntervals[0])
      
      for (i in 1 until newIntervals.size) {
        if (output.last()[1] >= newIntervals[i][0]) {
          output.last()[1] = Math.max(output.last()[1], newIntervals[i][1])
        } else {
          output.add(newIntervals[i])
        }
      }
      
      return output.toTypedArray()
    }
}
