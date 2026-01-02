class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.size == 1) {
            digits[0] += 1

            return if (digits[0] == 10) {
                intArrayOf(1, 0)
            } else {
                digits
            }
        }

        digits[digits.size - 1] += 1

        for (i in digits.size - 1 downTo 0) {
            if (digits[i] == 10) {
                digits[i] = 0

                if (i != 0) {
                    digits[i - 1] += 1
                }
            }
        }

        if (digits[0] == 0) {
            return intArrayOf(1) + digits
        } else {
            return digits
        }
    }
}
