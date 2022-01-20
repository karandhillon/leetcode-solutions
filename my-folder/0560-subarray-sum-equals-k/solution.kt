class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
      var count = 0
      
      val map = HashMap<Int, Int>()
      map.put(0, 1)
      
      var prefixSum = 0
      for (i in 0 until nums.size) {
        prefixSum += nums[i]
        
        if (map.contains(prefixSum - k)) {
          count += map.getOrElse(prefixSum - k) {0}
        }
        
        map.put(prefixSum, map.getOrElse(prefixSum) {0} + 1)
      }
      
      return count
    }
}
