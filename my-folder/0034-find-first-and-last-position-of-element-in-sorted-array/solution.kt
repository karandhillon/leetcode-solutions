class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
      val ans = intArrayOf(-1, -1)
      
      var l = 0
      var r = nums.size - 1
      
      while (l <= r) {
        val m = l + (r - l) / 2
        
        when {
          nums[m] > target -> r = m - 1
          nums[m] < target -> l = m + 1
          else -> {
            ans[0] = m
            r = m - 1
          }
        }
      }
      
      l = 0
      r = nums.size - 1
      
      while (l <= r) {
        val m = l + (r - l) / 2
        
        when {
          nums[m] > target -> r = m - 1
          nums[m] < target -> l = m + 1
          else -> {
            ans[1] = m
            l = m + 1
          }
        }
      }
      
      return ans
    }
}
