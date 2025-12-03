class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hashMap = HashMap<Int, Int>()

        nums.forEachIndexed { index, value -> 
            if (
                hashMap.contains(value) &&
                Math.abs(hashMap.get(value)!! - index) <= k
            ) {
                return true
            }

            hashMap.put(value, index)
        }

        return false
    }
}
