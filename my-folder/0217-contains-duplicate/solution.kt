class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set: HashSet<Int> = HashSet()

        nums.forEach { value ->
            if (set.contains(value)) {
                return true
            }

            set.add(value)
        }

        return false
    }
}
