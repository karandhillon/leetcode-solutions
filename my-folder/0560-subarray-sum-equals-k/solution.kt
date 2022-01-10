class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        map.put(0, 1)
        
        var counter = 0
        var prefixSum = 0
        nums.forEach { num ->
            prefixSum += num
            
            if (map.contains(prefixSum-k)) counter += map.get(prefixSum-k)!!
            
            map.put(prefixSum, map.getOrElse(prefixSum) {0} + 1)
        }
           
        return counter
    }
}
