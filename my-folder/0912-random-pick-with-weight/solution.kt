class Solution(val w: IntArray) {
  var totalSum = 0
  
  init {
    w.forEach { totalSum += it }
  }
  
    fun pickIndex(): Int {
      var random = (Math.random() * totalSum).toInt()
      
      var prefixSum = 0
      
      w.forEachIndexed { index, it ->
        prefixSum += it
        
        if (prefixSum > random) return index
      }
      
      return 0
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */
