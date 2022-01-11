class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val output = IntArray(nums.size) { 0 }
        
        var rs = 0
        for (i in 0 until nums.size) {
            rs += nums[i]
            output[i] = rs
        }
        
        return output
    }
}
