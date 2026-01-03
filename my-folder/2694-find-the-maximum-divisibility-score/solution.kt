class Solution {
    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        val map = HashMap<Int, Int>()

        for (divisor in divisors) {
            if (map.get(divisor) == null) {
                for (num in nums) {
                    if (num % divisor == 0) {
                        map[divisor] = map.getOrDefault(divisor, 0) + 1
                    }
                }
            }
        }

        var result = Int.MAX_VALUE
        var maxScore = -1

        println(map.getOrDefault(7, 0))
        println(map.getOrDefault(9, 0))

        for (divisor in divisors) {
            val score = map.getOrDefault(divisor, 0)
            if (score > maxScore) {
                result = divisor
                maxScore = score
            } else if (score == maxScore && divisor < result) {
                result = divisor
            }
        }

        return result
    }
}
