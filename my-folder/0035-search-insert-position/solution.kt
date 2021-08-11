class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return binarySearch(nums, 0, nums.size - 1, target)
    }
    
    fun binarySearch(array: IntArray, left: Int, right: Int, target: Int): Int {
        if (left >= right) {
            return if (array[left] < target) left + 1 else left
        }
        
        return if (array[(left + right)/2] > target) binarySearch(array, left, (left + right)/2 - 1, target)
        else if (array[(left + right)/2] < target) binarySearch(array, (left + right)/2 + 1, right, target)
        else (left + right)/2
    }
}
