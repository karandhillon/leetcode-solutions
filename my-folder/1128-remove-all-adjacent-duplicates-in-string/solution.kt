class Solution {
    fun removeDuplicates(s: String): String {
      val stack = Stack<Char>()
      
      for (i in 0 until s.length) {
        if (stack.isEmpty()) {
          stack.push(s[i])
        }
        else {
          if (stack.peek() == s[i]) stack.pop()
          else stack.push(s[i])
        }
      }
      
      val sb = StringBuilder()
      while (stack.isNotEmpty()) {
        sb.append(stack.pop())
      }
      
      return sb.toString().reversed()
    }
}
