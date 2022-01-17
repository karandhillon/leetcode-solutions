class Solution {
    fun search(nums: IntArray, target: Int): Int {
      var l = 0
      var r = nums.size - 1
      
      while (l < r) {
        val m = l + (r-l)/2
        
        if (nums[m] > nums[r]) l = m + 1
        else r = m
      }
      
      var s = l
      l = 0
      r = nums.size - 1
      
      val x = bs(nums, s, r, target)
      val y = bs(nums, l, s-1, target)
      
      if (x != -1) return x
      if (y != -1) return y
      
      return -1
    }
    
    fun bs(nums: IntArray, start: Int, end: Int, target: Int): Int {
      if (nums.isEmpty() || nums.size == 0) return -1
      if (start < 0 || end > nums.size - 1) return -1
      
      var l = start
      var r = end
      
      while (l <= r) {
        val m = l + (r - l)/2
        
        when {
          nums[m] == target -> return m
          nums[m] < target -> l = m + 1
          target < nums[m] -> r = m - 1
        }
      }
      
      return -1
    }
}
