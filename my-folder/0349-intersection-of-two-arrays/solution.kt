class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = HashSet<Int>()
        val outputSet = HashSet<Int>()
        
        nums1.forEach { num ->
            set.add(num)
        }
        
        nums2.forEach { num ->
            if (set.contains(num)) outputSet.add(num)
        }
        
        return outputSet.toIntArray()
    }
}
