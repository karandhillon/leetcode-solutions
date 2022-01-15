/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
      var l = 1
      var r = n
      
      while (l <= r) {
        val m = l + (r-l)/2
        
        when (guess(m)) {
          -1 -> r = m - 1
          1 -> l = m + 1
          else -> return m
        }
      }
      
      return -1
    }
}
