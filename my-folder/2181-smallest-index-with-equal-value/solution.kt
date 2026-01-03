class Solution {
    fun smallestEqual(nums: IntArray): Int {
        var o = Int.MAX_VALUE

        nums.forEachIndexed { i, v ->
            if (i % 10 == v) {
                o = Math.min(o, i)
            }
        }

        return if (o == Int.MAX_VALUE) - 1 else o
    }
}
