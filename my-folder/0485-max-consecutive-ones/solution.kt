class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
      var consecutiveOnesCount = 0
      var l = 0
      
//       [1,1,0,1,1,1]
//        0 1 2 3 4 5
//        l
//            r
//        consecutiveOnesCount = 2
      
      for (r in 0 until nums.size) {
        if (nums[r] == 0) {
          while (l <= r)
            ++l
        }
        
        consecutiveOnesCount = Math.max(consecutiveOnesCount, r - l + 1)
      }
      
      return consecutiveOnesCount
    }
}
