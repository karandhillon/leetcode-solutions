class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
      var cumulativeSum = 0
      var result = 0
      val hashMap = HashMap<Int, Int>().apply { put(0, 1) }
      
      nums.forEach {
        cumulativeSum += it
        
        if (hashMap.containsKey(cumulativeSum - k))
          result += hashMap.getOrDefault(cumulativeSum - k, 0)
        
        hashMap.put(cumulativeSum, hashMap.getOrDefault(cumulativeSum, 0) + 1)
      }
      
      return result     
    }
}
