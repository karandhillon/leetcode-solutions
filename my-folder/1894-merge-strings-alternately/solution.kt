class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val word1Array = word1.toCharArray()
        val word2Array = word2.toCharArray()

        var a = 0
        var b = 0

        val sb = StringBuilder()

        while (a <= word1Array.size - 1 || b <= word2Array.size - 1) {
            if (a <= word1Array.size - 1) {
                sb.append(word1Array[a])

                ++a
            }

            if (b <= word2Array.size  - 1) {
                sb.append(word2Array[b])

                ++b
            }
        }

        return sb.toString()
    }
}
