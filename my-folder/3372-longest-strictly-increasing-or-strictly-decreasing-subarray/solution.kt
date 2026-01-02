class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        if (nums.size == 1) {
            return 1
        }
        
        var l = 0
        var r = 0
        var incSize = Int.MIN_VALUE

        while (r <= nums.size - 2) {
            if (nums[r + 1] > nums[r]) {
                ++r
                incSize = Math.max(incSize, r - l + 1)
            } else {
                incSize = Math.max(incSize, r - l + 1)
                r = r + 1
                l = r
            }
        }

        l = 0
        r = 0
        var decSize = Int.MIN_VALUE

        while (r <= nums.size - 2) {
            if (nums[r + 1] < nums[r]) {
                ++r
                decSize = Math.max(decSize, r - l + 1)
            } else {
                decSize = Math.max(decSize, r - l + 1)
                r = r + 1
                l = r
            }
        }

        return Math.max(decSize, incSize)
    }
}
