class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        
        backtrack(result, nums, 0)
        
        return result
    }
    
    fun backtrack(
        result: ArrayList<ArrayList<Int>>,
        nums: IntArray,
        start: Int
    ) {
        if (start == nums.size-1) {
            result.add(toArrayList(nums))
        } else {
            for (i in start until nums.size) {
                swap(nums, i, start)
                backtrack(result, nums, start + 1)
                swap(nums, i, start)
            }
        }
    }
    
    fun toArrayList(nums: IntArray) : ArrayList<Int> {
        val output = ArrayList<Int>()
        
        nums.forEach { output.add(it) }
        
        return output
    }
    
    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}

