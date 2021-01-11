class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val solution = IntArray(2)
        var optimizationFlag = true
        
        nums.forEachIndexed { index, num ->
            if(optimizationFlag) {
                if(index == nums.size-1) {
                    print("This should never be executed --__--")
                }
                else {
                    for(i in index+1..nums.size-1) {
                        if(optimizationFlag) {
                            if(num + nums[i] == target) {
                                solution[0] = index
                                solution[1] = i
                                optimizationFlag = false
                            }
                        }
                    }
                }
            }
        }
        
        return solution
    }
}
