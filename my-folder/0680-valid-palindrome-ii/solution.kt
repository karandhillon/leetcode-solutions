class Solution {
  var hasCharbeenRemoved = false
    fun validPalindrome(s: String): Boolean {
      var l = 0
      var r = s.length - 1
      
      while (l < r) {
        if (s[l] == s[r]) {
          ++l
          --r
        } else {
          if (!hasCharbeenRemoved) {
            hasCharbeenRemoved = true
            
            val left = validPalindrome(s.substring(l, r))
            val right = validPalindrome(s.substring(l+1, r+1))
            
            return if (left || right) true else false
          } else {
            return false
          }
        }
      }
      
      return true
    }
}
