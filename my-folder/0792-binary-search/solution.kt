class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val m = (l+r)/2

            if (nums[m] == target) {
                return m
            }

            if (nums[m] < target) {
                l = m + 1
            }

            if (nums[m] > target) {
                r = m - 1
            }
        }

        // target not found
        return -1
    }
}
