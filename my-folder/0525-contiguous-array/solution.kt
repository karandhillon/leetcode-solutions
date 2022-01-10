class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        map.put(0 , -1)
        
        var maxLength = 0
        var ps = 0
        for (i in 0 until nums.size) {
            if (nums[i] == 0) --ps else ++ps
            
            if (map.contains(ps)) { maxLength = Math.max(maxLength, i - map.get(ps)!!) }
            else map.put(ps, i)
        }
        
        return maxLength
    }
}
