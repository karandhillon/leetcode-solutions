class Solution {
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        map.put(0, 1)
        
        var prefixSum = 0
        var counter = 0
        
        nums.forEach { num ->
            prefixSum += num
            val rem = if(prefixSum % k < 0) prefixSum % k + k else prefixSum % k
            
            if(map.contains(rem)) counter += map.getOrElse(rem) { 0 }

            map.put(rem, map.getOrElse(rem) { 0 } + 1)
        }
        
        return counter
    }
}
