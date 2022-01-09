class Solution(val w: IntArray) {
  
  var totalSum: Int = 0
  lateinit var prefixSums: IntArray
  
  init {
    prefixSums = IntArray(w.size) { 0 }
    
    var prefixSum = 0
    w.forEachIndexed { index, weight ->
      prefixSum += weight
      prefixSums[index] = prefixSum
    }
    
    totalSum = prefixSum
  }

    fun pickIndex(): Int {
      val random = (Math.random() * totalSum).toInt()
      
      prefixSums.forEachIndexed { index, ps ->
        if (ps > random) return index
      }
      
      return 1
    }
}

