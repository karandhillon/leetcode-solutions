class Solution {
    fun maximumSwap(num: Int): Int {
      val nums = num.toString().toCharArray()
      val map = HashMap<Int, Int>()
      
      for (i in 0 until nums.size) {
        map.put(nums[i] - '0', i)
      }
      
      for (i in 0 until nums.size) {
        val num = nums[i] - '0'
        
        for (j in 9 downTo num+1) {
          if (map.contains(j) && map.get(j)!! > i) {
            val temp = nums[i]
            nums[i] = nums[map.get(j)!!]
            nums[map.get(j)!!] = temp

            return Integer.valueOf(String(nums))
          }
        }
      }
      
      return num
    }
}
