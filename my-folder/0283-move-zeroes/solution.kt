class Solution {
    fun moveZeroes(nums: IntArray): Unit {
      var zeroCounter = 0
      
      nums.forEach { if (it == 0) ++zeroCounter }

      var left = 0
      var right = nums.size - zeroCounter
      
      for (i in 0 until nums.size) {
        if (nums[i] != 0) {
          nums[left] = nums[i]
          left++
        }
      }
      
      while (right <= nums.size - 1) {
        nums[right] = 0
        right++
      }
    }
}
