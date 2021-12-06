class Solution {
    fun search(nums: IntArray, target: Int): Int {
      var output = -1
      
      var l = 0
      var r = nums.size - 1
      
      while (l <= r) {
        val middle = l + (r - l)/2
        
        if (nums[middle] == target) {
          output = middle
          l = r + 1
        } else if (nums[middle] < target) {
          l = middle + 1
        } else {
          r = middle - 1
        }
      }
      
      return output
    }
}
