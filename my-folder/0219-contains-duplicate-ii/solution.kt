class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
      val map = HashMap<Int, Int>()
      
      for (i in 0 until nums.size) {
        if (
          map.contains(nums[i]) && 
          Math.abs(map.get(nums[i])!! - i) <= k
        ) return true
        
        map.put(nums[i], i)
      }
      
      return false
    }
}
