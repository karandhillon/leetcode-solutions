class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()

        for (item in target) {
            val entry = map.getOrPut(item) { 0 }
            map.put(item, entry + 1)
        }

        for (item in arr) {
            val entry = map.get(item)

            if (entry != null) {
                map.put(item, entry - 1)
            }
        }

        var flag = true

        for (entry in map.entries) {
            if (entry.value != 0) {
                flag = false
            }
        }

        return flag
    }
}
