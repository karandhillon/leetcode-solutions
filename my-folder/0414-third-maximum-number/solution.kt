class Solution {
    fun thirdMax(nums: IntArray): Int {
        var first: Long = Long.MIN_VALUE
        var second: Long = Long.MIN_VALUE
        var third: Long = Long.MIN_VALUE

        for (num in nums) {
            val n = num.toLong()

            when {
                first == n || second == n || third == n -> {
                    continue
                }
                first <= n -> {
                    third = second
                    second = first
                    first = n
                }
                second <= n -> {
                    third = second
                    second = n
                }
                third <= n -> {                  
                    third = n
                }
            }
        }

        if (third == Long.MIN_VALUE) {
            return first.toInt()
        } else {
            return third.toInt()
        }
    }
}
