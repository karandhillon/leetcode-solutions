class Solution {
    fun nextPermutation(nums: IntArray): Unit {
      if (nums.size == 1) return
      
      var l = -1
      for (i in nums.size-1 downTo 1) {
        if (nums[i-1] < nums[i]) {
          l = i-1
          break
        }
      }
      
      if (l == -1) {
        reverse(nums, 0, nums.size-1)       
        return
      }
      
      var r = -1
      var nextGreater = 101
      for (i in l+1 until nums.size) {
        if (nums[i] > nums[l] && nums[i] <= nextGreater) {
          nextGreater = nums[i]
          r = i
        }
      }
      
      swap(nums, l, r)
      reverse(nums, l+1, nums.size-1)
    }
  
    fun reverse(nums: IntArray, s: Int, e: Int) {
      var l = s
      var r = e
      
      while (l < r) {
        val temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
        
        ++l
        --r
      }
    }
    
    fun swap(nums: IntArray, l: Int, r: Int) {
      val temp = nums[l]
      nums[l] = nums[r]
      nums[r] = temp
    }
}
