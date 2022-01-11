class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
      val output = ArrayList<List<Int>>()
      
      backtrack(nums, 0, output)
      
      return output
    }
    
    fun backtrack(
      nums: IntArray,
      s: Int,
      output: ArrayList<List<Int>>
    ) {
      if (s == nums.size) {
        output.add(nums.toList())
        return
      }
      
      for (i in s until nums.size) {
        swap(nums, i, s)
        backtrack(nums, s+1, output)
        swap(nums, i, s)
      }
    }
    
    fun swap(
      nums: IntArray,
      first: Int,
      second: Int
    ) {
      val cache = nums[first]
      nums[first] = nums[second]
      nums[second] = cache
    }
}
