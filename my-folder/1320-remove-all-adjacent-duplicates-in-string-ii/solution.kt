class Solution {
    fun removeDuplicates(s: String, k: Int): String {
      if (s.length == 0) return s
      
      val stack = Stack<Pair<Int, Char>>()
      
      for (i in 0 until s.length) {
        if (stack.isEmpty()) stack.push(Pair(1, s[i]))
        else {
          if (stack.peek().second == s[i]) {
            if (stack.peek().first + 1 == k) stack.pop()
            else {
              val popped = stack.pop()
              val times = popped.first
              val char = popped.second
              
              stack.push(Pair(times+1, char))
            }
          }
          else stack.push(Pair(1, s[i]))
        }
      }
      
      val sb = StringBuilder()
      
      while (stack.isNotEmpty()) {
        val popped = stack.pop()
        val times = popped.first
        val char = popped.second
        
        for (i in 0 until times) {
          sb.append(char)
        }
      }
      
      return sb.toString().reversed()
    }
}
