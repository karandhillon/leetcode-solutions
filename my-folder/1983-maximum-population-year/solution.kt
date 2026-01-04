class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val array: IntArray = IntArray(100)

        for (log in logs) {
            val birth = log[0] - 1950
            val lastAlive = log[1] - 1950 - 1

            for (i in birth..lastAlive) {
                array[i] += 1
            }
        }

        var max = Int.MIN_VALUE
        var i = -1

        array.forEachIndexed { index, value ->
            if (value > max) {
                i = index
                max = value
            }
        }
        
        return i + 1950
    }
}
