class Solution(w: IntArray) {
  private var totalSum = 0
  private val prefixSum = IntArray(w.size)
  
  init {
    var pSum = 0
    for (i in 0 until w.size) {
      pSum += w[i]
      prefixSum[i] = pSum
    }
    
    totalSum = pSum
  }
  
    fun pickIndex(): Int {
      val randomWeight = (Math.random() * totalSum).toInt()
      
      for (i in 0 until prefixSum.size) {
        if (randomWeight < prefixSum[i]) return i
      }
      
      return 0
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */
