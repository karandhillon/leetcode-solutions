class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size) {0}
        
        var product = 1
        for (i in 0 until nums.size) {
            output[i] = product
            product *= nums[i]
        }
        
        product = 1
        
        for (i in nums.size-1 downTo 0) {
            output[i] *= product
            product *= nums[i]
        }
        
        return output
    }
}

//     fun productExceptSelf(nums: IntArray): IntArray {
//         val forward = HashMap<Int, Int>()
//         for (i in 0 until nums.size) {
//             forward.put(i, nums[i] * forward.getOrElse(i-1) {1})
//         }
        
//         val reverse = HashMap<Int, Int>()        
//         for (i in nums.size-1 downTo 0) {
//             reverse.put(i, nums[i] * reverse.getOrElse(i+1) {1})
//         }
        
//         val output = IntArray(nums.size) {0}
//         for (i in 0 until nums.size) {
//             output[i] = forward.getOrElse(i-1) {1} * reverse.getOrElse(i+1) {1}
//         }
        
//         return output
//     }
