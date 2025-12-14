class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        val data = blocks.toCharArray()
        
        var w = 0
        var r = 0

        while (r <= k - 1) {
            if (data[r] == 'W') ++w

            ++r
        }

        var min = w

        while (r <= data.size - 1) {
            if (data[r] == 'W') ++w
            if (data[r - k] == 'W') --w

            min = Math.min(w, min)

            ++r
        }

        return min
    }
}
