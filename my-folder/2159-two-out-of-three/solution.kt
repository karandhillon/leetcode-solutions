class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val map: HashMap<Int, BooleanArray> = HashMap()

        nums1.forEach { value ->
            map.getOrPut(value) { booleanArrayOf(true, false, false) }
        }

        nums2.forEach { value ->
            val entry = map.getOrPut(value) { booleanArrayOf(false, true, false) }
            entry[1] = true
        }

        nums3.forEach { value ->
            val entry = map.getOrPut(value) { booleanArrayOf(false, false, true) }
            entry[2] = true
        }

        val list = arrayListOf<Int>()

        map.forEach { key, array ->
            var counter = 0
            
            for (item in array) {
                if (item) ++counter
            }

            if (counter >= 2) {
                list.add(key)
            }
        }

        return list
    }
}
