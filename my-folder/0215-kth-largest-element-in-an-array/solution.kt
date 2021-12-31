class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
      val pq = PriorityQueue<Int>()
      
      for (i in 0 until nums.size) {
        pq.offer(nums[i])
        
        if (pq.size > k) pq.poll()
      }
      
      return pq.poll()
    }
}
