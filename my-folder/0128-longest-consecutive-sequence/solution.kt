class Solution {
    fun longestConsecutive(nums: IntArray): Int {
      if (nums.size <= 1) return nums.size
      
      val uf = UnionFind(nums.size)
      
      val valueToIndex = HashMap<Int, Int>()
      for (i in 0 until nums.size) {
        valueToIndex.put(nums[i], i)
        
        if (valueToIndex.contains(nums[i]-1)) { uf.union(i, valueToIndex.get(nums[i]-1)!!) }
        if (valueToIndex.contains(nums[i]+1)) { uf.union(i, valueToIndex.get(nums[i]+1)!!) }
      }
      
      val keyToCount = HashMap<Int, Int>()
      var max = -1
      for ((value, index) in valueToIndex) {
        val parent = uf.root(index)
        keyToCount.put(parent, keyToCount.getOrElse(parent) {0} + 1)
        max = Math.max(max, keyToCount.getOrElse(parent) { 0 })
      }
      
      return max
    }
}

class UnionFind(val size: Int) {
  private val parent = IntArray(size)
  private val weight = IntArray(size)
  
  init {
    for (i in parent.indices) {
      parent[i] = i
      weight[i] = 1
    }
  }
  
  fun root(a: Int): Int {
    if (parent[a] == a) return a
    
    parent[a] = root(parent[a])
    
    return parent[a]
  }
  
  fun union(a: Int, b: Int) {
    val rootA = root(a)
    val rootB = root(b)
    
    if (rootA == rootB) return
    
    if (weight[rootA] > weight[rootB]) {
      parent[rootB] = parent[rootA]
      weight[rootA] += weight[rootB]
    } else {
      parent[rootA] = parent[rootB]
      weight[rootB] += weight[rootA]
    }
  }
}
