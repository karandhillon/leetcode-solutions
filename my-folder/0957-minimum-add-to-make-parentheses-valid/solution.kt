class Solution {
    fun minAddToMakeValid(s: String): Int {
      var counter = 0
      var open = 0
      
      for (i in 0 until s.length) {
        if (s[i] == '(') ++open
        if (s[i] == ')') {
          if (open > 0) --open
          else ++counter
        }
      }
      
      return counter + open
    }
}
