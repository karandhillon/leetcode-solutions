class Solution {
    fun minRemoveToMakeValid(s: String): String {
      val set = HashSet<Int>()
      var counter = 0
      
      for (i in 0 until s.length) {
        if (s[i] == '(') ++counter
        if (s[i] == ')') {
          if (counter > 0) --counter 
          else set.add(i)
        }
      }
      
      counter = 0
      for (i in s.length-1 downTo 0) {
        if (s[i] == ')') ++counter
        if (s[i] == '(') {
          if (counter > 0) --counter 
          else set.add(i)
        }
      }
      
      val sb = StringBuilder()
      for (i in 0 until s.length) {
        if (!set.contains(i)) sb.append(s[i])
      }
      
      return sb.toString()
    }
}
