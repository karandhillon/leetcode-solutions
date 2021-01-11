class Solution {
    fun isPalindrome(s: String): Boolean {
        val regex = Regex("[^A-Za-z0-9 ]")
        val string = s.replace(regex, "")
            .replace(" ", "")
            .toLowerCase()
        
        if(string == string.reversed()) return true else return false
    }
}
