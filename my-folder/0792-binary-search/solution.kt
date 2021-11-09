class Solution {
    fun search(nums: IntArray, target: Int): Int {
      var output = -1
      
      // POINTERS
      var left = 0
      var right = nums.size - 1
      
      // BREAKER
      var flag = true
      
      while (left <= right && flag) {
        val middleIndex = (left+right)/2
        
        if (nums[middleIndex] == target) {
          output = middleIndex
          flag = false
        }
        
        if (nums[middleIndex] < target) {
          left = middleIndex + 1
        }
        
        if (nums[middleIndex] > target) {
          right = middleIndex - 1
        }
      }
      
      return output
    }
}
