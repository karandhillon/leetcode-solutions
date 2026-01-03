class Solution {
    fun minElement(nums: IntArray): Int {
        for (i in 0..nums.size - 1) {
            var sum = 0

            nums[i].toString().toCharArray().forEach { c ->
                sum += c.digitToInt()
            }

            nums[i] = sum
        }

        var min = Int.MAX_VALUE

        for (num in nums) {
            min = Math.min(min, num)
        }

        return min
    }
}
