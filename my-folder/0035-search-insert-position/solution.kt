class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
      var l = 0
      var r = nums.size-1
      
      while (l <= r) {
        val m = l + (r - l) / 2
        
        when {
          nums[m] < target -> l = m + 1
          target < nums[m] -> r = m - 1
          else -> return m
        }
      }
      
      return l
    }
}
