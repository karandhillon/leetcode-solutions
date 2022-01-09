class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
      var increasing = false
      var decreasing = false
      
      for (i in 0 until nums.size-1) {
        if (nums[i] > nums[i+1]) decreasing = true
        if (nums[i] < nums[i+1]) increasing = true
      }
      
      return if (increasing && decreasing) false else true
    }
}

//     fun isMonotonic(nums: IntArray): Boolean {
//       val start = nums[0]
//       val end = nums[nums.size-1]
      
//       if (start < end) { // we have monotonic increasing
//         for (i in 0 until nums.size-1) {
//           if (nums[i] > nums[i+1]) return false
//         }        
//       } else if (start > end){ // we have monotonic increasing
//         for (i in 0 until nums.size-1) {
//           if (nums[i] < nums[i+1]) return false
//         }
//       } else { // Same. Loop array and every element should be same
//         for (i in 0 until nums.size-1) {
//           if (nums[i] != nums[i+1]) return false
//         }
//       }
      
//       return true
//     }
