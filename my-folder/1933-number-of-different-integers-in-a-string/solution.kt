class Solution {
    fun numDifferentIntegers(word: String): Int {
        val cleaned = word.map { char -> if (char.isDigit()) char else ' '}.joinToString("")
        val segments = cleaned.split(" ").filter { it.isNotEmpty() }

        val set = mutableSetOf<String>()

        for (num in segments) {
            val normalized = num.dropWhile { it == '0' }
            set.add(normalized)
        }

        return set.size
    }
}
