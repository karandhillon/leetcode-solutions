class Solution {
    fun reverseVowels(s: String): String {
        val stack = Stack<Char>()

        for (char in s) {
            if (isVowel(char)) {
                stack.push(char)
            }
        }

        val sb = StringBuilder()

        for (char in s) {
            if (isVowel(char)) {
                sb.append(stack.pop())
            } else {
                sb.append(char)
            }
        }

        return sb.toString()
    }

    fun isVowel(c: Char): Boolean {
        val set = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        return set.contains(c)
    }
}
