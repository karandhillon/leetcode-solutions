class Solution {
    fun sumFourDivisors(nums: IntArray): Int {
        var output = 0

        for (num in nums) {
            var count = 2
            var sum = num + 1

            for (i in 2..(num/2).toInt()) {
                if (num % i == 0) {
                    ++count
                    sum += i
                }
            }

            if (count == 4) {
                 output += sum
            }
        }

        return output
    }
}
