class Solution {
    fun myPow(x: Double, n: Int): Double {
      return if (n < 0) fastPower(1/x, -n) else fastPower(x, n)
    }
    
    fun fastPower(x: Double, n: Int): Double {
      if (n == 0) return 1.0
      
      val half = fastPower(x, n/2)
      return if (n%2 == 0) half*half else half*half*x
    }
}
