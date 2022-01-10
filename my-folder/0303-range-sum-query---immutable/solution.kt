class NumArray(val nums: IntArray) {
    val map = HashMap<Int, Int>()
    
    init {
        map.put(-1, 0)
        var prefixSum = 0
        
        for (i in 0 until nums.size) {
            prefixSum += nums[i]
            map.put(i, prefixSum)
        }
    }
    
    fun sumRange(left: Int, right: Int): Int {
        return map.get(right)!! - map.get(left-1)!!
    }

}

