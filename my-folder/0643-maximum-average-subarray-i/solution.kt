class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var windowSum: Double = 0.0
    
        for (i in 0 until k) {
            windowSum += nums[i]
        }

        var maxAvg: Double = windowSum / k

        for (i in k until nums.size) {
            windowSum += nums[i]
            windowSum -= nums[i - k]
            
            val avg: Double = windowSum / k

            maxAvg = Math.max(maxAvg, avg)
        }

        return maxAvg
    }
}
