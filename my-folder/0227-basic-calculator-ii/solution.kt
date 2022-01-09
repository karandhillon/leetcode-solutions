class Solution {
    fun calculate(s: String): Int {
      if (s.isEmpty() || s == null) return 0
      
      val stack = Stack<Int>()
      
      var number = 0
      var operation = '+'
      
      for (i in 0 until s.length) {
        val char = s[i]
        
        if (Character.isDigit(char)) {
          number = number * 10 + (char - '0')
        }
        
        if (!Character.isDigit(char) && !Character.isWhitespace(char) || i == s.length-1) {
          when (operation) {
            '+' -> stack.push(number)
            '-' -> stack.push(-number)
            '*' -> stack.push(stack.pop() * number)
            '/' -> stack.push(stack.pop() / number)
          }
          
          number = 0
          operation = char
        }
      }
      
      var result = 0
      while(stack.isNotEmpty()) {
        result += stack.pop()
      }

      return result
    }
}
