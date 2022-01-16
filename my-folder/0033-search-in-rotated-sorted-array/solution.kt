class Solution {
    fun search(nums: IntArray, target: Int): Int {
      if (nums.size == 1) {
        return if (nums[0] == target) 0 else -1
      }
      
      var l = 0
      var r = nums.size - 1
      
      while (l < r) {
        val m = l + (r - l ) /2
        
        if (nums[m] > nums[r]) l = m + 1
        else r = m
      }
      
      var s = r
      
      l = 0
      r = nums.size-1
      
      if (target <= nums[r]) {
        l = s
        r = nums.size - 1
        
        while (l <= r) {
          val m = l + (r - l) / 2

          if (nums[m] == target) return m
          
          if (nums[m] < target) l = m + 1
          else r = m - 1
        }
        
        return -1
      }
      else {
        l = 0
        r = s-1
        
        while (l <= r) {
          val m = l + (r - l) / 2
          
          if (nums[m] == target) return m
          
          if (nums[m] < target) l = m + 1
          else r = m - 1
        }
        
        return -1
      }
      
      return -1
    }
}
