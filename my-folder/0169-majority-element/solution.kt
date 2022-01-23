class Solution {
    fun majorityElement(nums: IntArray): Int {
      val map = HashMap<Int, Int>()
      
      for (i in 0 until nums.size) {
        map.put(nums[i], map.getOrElse(nums[i]) { 0 } + 1)
      }
      
      for ((k, v) in map) {
        if (v > nums.size/2) return k
      }
      
      return -1
    }
}
