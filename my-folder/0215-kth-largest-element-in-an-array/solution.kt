class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
      val minPQ = PriorityQueue<Int>()
      
      nums.forEach { num ->
        minPQ.offer(num)
        
        if (minPQ.size > k) {
          minPQ.poll()
        }
      }
      
      return minPQ.poll()
    }
}
