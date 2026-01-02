class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        for (num in nums) {
            val entry = map.getOrPut(num) { 0 }

            if (entry != 0) {
                return num
            } else {
                map.put(num, entry + 1)
            }
        }

        return -1
    }
}
