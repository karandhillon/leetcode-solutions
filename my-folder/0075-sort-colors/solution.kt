class Solution {
    fun sortColors(nums: IntArray): Unit {
        for (i in 0..nums.size - 1) {
            nums.forEachIndexed { index, num ->
                if (index != nums.size - 1) {
                    if (nums[index] > nums[index + 1]) {
                        val temp = nums[index]
                        nums[index] = nums[index + 1]
                        nums[index + 1] = temp
                    }
                }
            }
        }
        nums.forEach { num -> 
            print(num)
        }
    }
}
