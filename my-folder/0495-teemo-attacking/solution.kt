class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var counter = 0

        for (i in 0..timeSeries.size - 2) {
            val curr = timeSeries[i]
            val next = timeSeries[i + 1]

            if (next > (curr + duration - 1)) {
                counter += duration
            } else {
                counter += next - curr
            }
        }

        return counter + duration
    }
}
