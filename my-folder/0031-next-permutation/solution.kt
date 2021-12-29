class Solution {
  fun nextPermutation(nums: IntArray): Unit {
    var l = 0
    var r = nums.size - 1
    var flag = true
    
    while (r > l && flag) {
      if (nums[r] > nums[r-1]) {
        flag = false
        --r
      } else {
       --r 
      }
    }
    
    println("Index of first break: $r")
    
    if (flag) {
      l = 0
      r = nums.size - 1
      
      while (l <= r) {
        val temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
      
        ++l
        --r
      }
      
      return
    }
    
    val justGreatestIndex = findIndexOfJustGreatest(nums, nums[r], r+1)
    
    println("Index of just greatest: $justGreatestIndex")
    
    val temp = nums[justGreatestIndex]
    nums[justGreatestIndex] = nums[r]
    nums[r] = temp
    
    l = r + 1
    r = nums.size - 1
    
    while (l <= r) {
      val temp = nums[l]
      nums[l] = nums[r]
      nums[r] = temp
      
      ++l
      --r
    }
  }
  
  fun findIndexOfJustGreatest(nums: IntArray, target: Int, startIndex: Int): Int {
    var output = 101
    var result = 0
    
    for (i in startIndex until nums.size) {
      if (nums[i] > target && nums[i] <= output) {
        output = nums[i]
        result = i
      }
    }
    
    return result
  }
}
