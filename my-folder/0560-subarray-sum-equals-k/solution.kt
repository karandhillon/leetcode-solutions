class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
      val map = HashMap<Int, Int>().apply { put(0, 1) }
      
      var counter = 0
      var sum = 0
      
      for (num in nums) {
        sum += num
        if (map.contains(sum - k)) counter += map.getOrElse(sum - k) { 0 }
        map.put(sum, map.getOrElse(sum) { 0 } + 1)
      }
      
      return counter
    }
}
