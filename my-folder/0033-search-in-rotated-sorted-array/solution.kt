class Solution {
    fun search(nums: IntArray, target: Int): Int {      
      var l = 0
      var r = nums.size - 1
      val s = findSmallestNumberIndex(nums)
      
      if (target >= nums[s] && target <= nums[r]) l = s
      else r = s - 1
  
      while (l <= r) {
        val m = l + (r - l) / 2
        
        if (nums[m] == target) return m
        else if (nums[m] < target) l = m + 1
        else r = m -1
      }

      return -1
    }
    
    fun findSmallestNumberIndex(nums: IntArray): Int {
      var l = 0
      var r = nums.size - 1
      
      while (l < r) {
        val m = l + (r - l) / 2
        
        if (nums[m] > nums[r]) l = m + 1
        else if (nums[m] < nums[r]) r = m
      }
      
      return l
    }
}
