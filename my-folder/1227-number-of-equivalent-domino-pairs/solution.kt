class Solution {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        var l = 0
        var r = l + 1

        var count = 0

        while (l < dominoes.size - 1) {
            while (r <= dominoes.size - 1) {
                if (isEqual(dominoes[l], dominoes[r])) {
                    ++count
                }

                ++r
            }

            ++l
            r = l + 1
        }

        return count
    }

    fun isEqual(a: IntArray, b: IntArray): Boolean {
        return if (
            (a[0] == b[0] && a[1] == b[1])
            || (a[0] == b[1] && a[1] == b[0])
        ) {
            true
        } else {
            false
        }
    }
}
