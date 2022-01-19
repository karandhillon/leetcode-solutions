class Solution {
    fun validPalindrome(s: String): Boolean {
      return helper(s, false)
    }
    
    fun helper(input: String, alreadyDeletedCharacter: Boolean) : Boolean {
      if (input.length == 0) return true
      
      var l = 0
      var r = input.length - 1
      
      while (l < r) {
        if (input[l] != input[r]) {
          if (alreadyDeletedCharacter) return false
          else return helper(input.substring(l, r), true) || helper(input.substring(l+1, r+1), true)
        }
        
        ++l
        --r
      }
      
      return true
    }
}
