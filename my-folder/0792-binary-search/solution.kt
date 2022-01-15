class Solution {
    fun search(nums: IntArray, target: Int): Int {
     var l = 0
    var r = nums.size - 1

    while (l <= r) { // worst case, there's only one element left in the range.
        val m = l + (r - l) / 2

        when {
            nums[m] < target -> l = m + 1
            target < nums[m] -> r = m - 1
            else -> return m
        }
    }

    return -1
    }
}

