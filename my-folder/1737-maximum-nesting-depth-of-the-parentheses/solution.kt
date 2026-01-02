class Solution {
    fun maxDepth(s: String): Int {
        var maxDepth = 0
        val stack = Stack<Char>()

        s.forEach { c ->
            if (c == '(') {
                stack.push('(')

                maxDepth = Math.max(maxDepth, stack.size)
            } else if (c == ')') {
                stack.pop()
            }
        }

        return maxDepth
    }
}
