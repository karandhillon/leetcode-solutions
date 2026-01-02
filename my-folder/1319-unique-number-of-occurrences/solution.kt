class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        var flag = true
        val map = HashMap<Int, Int>()

        for (e in arr) {
            val entry = map.getOrPut(e) { 0 }
            map.put(e, entry + 1)
        }

        val set = mutableSetOf<Int>()

        for (entry in map.entries) {
            if (set.contains(entry.value)) {
                flag = false
            } else {
                set.add(entry.value)
            }
        }

        return flag
    }
}
