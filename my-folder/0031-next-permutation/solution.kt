class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.size - 2
        
        while (i >=0 && nums[i] >= nums[i+1]) {
            i--
        }
        
        var j = nums.size - 1
        
        if (i >= 0) {
            while(j > i && nums[j] <= nums[i]) {
                j--
            }
        
            swap(nums, i, j)
        }
        
        reverse(nums, i+1)
    }
    
    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
    
    fun reverse(nums: IntArray, i: Int) {
        var start = i
        var end = nums.size - 1
        
        while (start < end) {
            swap(nums, start, end)
            start++
            end--
        }
    }
}

//1 2 4 5 2 1
  //      i j  
    //125124
