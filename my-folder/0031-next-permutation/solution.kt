class Solution {
    fun nextPermutation(nums: IntArray): Unit {
      var l = 0
      var biggest = false
      for (i in nums.size-1 downTo 1) {
        if (nums[i-1] < nums[i]) {
          l = i-1
          break
        }
        
        if (i == 1) { biggest = true }
      }
      
      var justMax = Int.MAX_VALUE
      var r = nums.size-1
      for (i in l+1 until nums.size) {
        if (
          nums[i] > nums[l] &&
          nums[i] <= justMax
        ) {
          justMax = nums[i]
          r = i
        }
      }
      
      if (l == 0 && biggest) {
        while (l < r) {
          swap(nums, l, r)
          ++l
          --r
        }     
        return
      }
      
      swap(nums, l, r)
      l = l+1
      r = nums.size-1
      
      while (l <= r) {
        swap(nums, l, r)
        ++l
        --r
      }
    }
    
    fun swap(nums: IntArray, i: Int, j: Int) {
      val cache = nums[i]
      nums[i] = nums[j]
      nums[j] = cache
    }
}
