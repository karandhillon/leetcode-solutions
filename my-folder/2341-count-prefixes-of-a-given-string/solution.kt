class Solution {
    fun countPrefixes(words: Array<String>, s: String): Int {
        var count = 0

        for (word in words) {
            var flag = true

            word.forEachIndexed { index, char ->
                if (index > s.length - 1) {
                    flag = false
                } else {
                    if (s[index] != char) {
                        flag = false
                    }
                }
            }

            if (flag) {
                ++count
            }
        }

        return count
    }
}
