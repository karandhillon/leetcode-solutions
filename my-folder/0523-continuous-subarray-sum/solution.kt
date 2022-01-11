class Solution {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        map.put(0, -1)
        
        var ps = 0
        for(i in 0 until nums.size) {
            ps += nums[i]
            
            if (map.contains(ps%k)) {
                if (i-map.get(ps%k)!!>1) return true
            } else map.put(ps%k, i)
        }
        
        return false
    }
}
