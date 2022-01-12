class Solution {
  var isCharDeleted = false
  
    fun validPalindrome(s: String): Boolean {
      if (s.isEmpty()) return true
      
      var l = 0
      var r = s.length - 1
      
      while (l < r) {
        if (s[l] == s[r]) {
          ++l
          --r
        } else {
          if (isCharDeleted) return false
          else {
            isCharDeleted = true
            return validPalindrome(s.substring(l, r)) || validPalindrome(s.substring(l+1, r+1))
          }
        }      
      }
      
      return true
    }
}
