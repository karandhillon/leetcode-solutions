class Solution {
  var hasSingleCharBeenDeleted = false
    fun validPalindrome(s: String): Boolean {  
      var l = 0
      var r = s.length - 1
      
      while (l < r) {
        if (s[l] == s[r]) {
          ++l
          --r
        } else {
          if (hasSingleCharBeenDeleted) return false
          
          hasSingleCharBeenDeleted = true
          return validPalindrome(s.substring(l, r)) || validPalindrome(s.substring(l+1, r+1))
        }
      }
      
      return true
    }
}
