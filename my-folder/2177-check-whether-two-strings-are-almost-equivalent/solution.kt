class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val map: HashMap<Char, Int> = HashMap()

        word1.forEach { c->
            map.put(c, map.getOrDefault(c, 0) + 1)
        }

        word2.forEach { c ->
           map.put(c, map.getOrDefault(c, 0) - 1)
        }

        println(map.toString())

        var flag = true

        for ((_, v) in map) {
            if (Math.abs(v) >= 4) {
                flag = false
            }
        }

        return flag
    }
}
