class Solution {
    fun reverseWords(s: String): String {
        val stack = Stack<String>()

        val list = s.trim().split(" ").filter { it.isNotBlank() }

        print(list.toString())

        for (word in list) {
            if (!word.equals(" ")) {
                stack.push(word)
            }
        }

        print(stack.toString())

        val sb = StringBuilder()

        while (stack.isNotEmpty()) {
            sb.append(stack.pop())
            sb.append(" ")
        }

        sb.deleteAt(sb.length - 1)

        return sb.toString()
    }
}
