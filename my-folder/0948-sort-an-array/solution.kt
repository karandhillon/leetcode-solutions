class Solution {
    fun sortArray(nums: IntArray): IntArray {
      return quickSort(nums)
    }
    
    fun quickSort(nums: IntArray): IntArray {
      if (nums.size < 2) return nums
      
      val pivot = nums.size/2
      val equal = nums.filter { it == nums[pivot] }.toIntArray()
      val left = nums.filter { it < nums[pivot] }.toIntArray()
      val right = nums.filter { it > nums[pivot] }.toIntArray()
      
      return quickSort(left) + equal + quickSort(right)
    }
    

}
