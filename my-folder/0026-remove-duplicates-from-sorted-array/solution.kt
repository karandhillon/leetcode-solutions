class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = mutableSetOf<Int>()

        for (i in 0..nums.size - 1) {
            if (set.contains(nums[i])) {
                nums[i] = 101
            } else {
                set.add(nums[i])
            }
        }

        nums.sort()

        return set.size
    }
}
