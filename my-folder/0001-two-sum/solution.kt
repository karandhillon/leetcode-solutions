class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        nums.forEachIndexed { index, value ->
            if (map.contains(target - value)) {
                return intArrayOf(index, map[target - value]!!)
            }

            map.put(value, index)
        }

        return intArrayOf(0, 0)
    }
}
