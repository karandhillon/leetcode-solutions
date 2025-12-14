class Solution {
    fun divisorSubstrings(num: Int, k: Int): Int {
        var count = 0
        val data = num.toString().map { it.digitToInt() }.toIntArray()
        
        var l = 0
        var r = k - 1

        while (r <= data.size - 1) {
            val sb = StringBuilder()
            
            for (i in l..r) {
                sb.append(data[i])
            }

            val result = sb.toString().toInt()

            if (result != 0 && num % result == 0) {
                ++count
            }

            ++l
            ++r
        }

        return count
    }
}
