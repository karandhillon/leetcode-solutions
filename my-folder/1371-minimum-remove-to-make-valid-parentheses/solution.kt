class Solution {
    fun minRemoveToMakeValid(s: String): String {
      var openCounter = 0
      var sb = StringBuilder()

      for (i in s.indices) {
        if (s[i] == '(') {
          sb.append(s[i])
          ++openCounter
        }
        else if (s[i] == ')') {
          if (openCounter > 0) {
            sb.append(s[i])
            --openCounter
          }
        }
        else sb.append(s[i])
      }
      
      val input = sb.toString()
      openCounter = 0
      sb.setLength(0)
      
      for (i in input.length-1 downTo 0) {
        if (input[i] == ')') {
          sb.append(input[i])
          ++openCounter
        }
        else if (input[i] == '(') {
          if (openCounter > 0) {
            sb.append(input[i])
            --openCounter
          }
        }
        else sb.append(input[i])
      }
      
      return sb.toString().reversed()
    }
}
