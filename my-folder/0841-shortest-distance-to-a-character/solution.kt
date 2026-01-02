class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val list = mutableListOf<Int>()

        s.forEachIndexed {index, char ->
            if (char == c) {
                list.add(index)
            }
        }

        println(list)

        val output: IntArray = IntArray(s.length)

        s.forEachIndexed { index, char ->
            if (char == c) {
                output[index] = 0
            } else {
                var min = Int.MAX_VALUE
                
                list.forEach {
                    min = Math.min(min, Math.abs(it - index))
                }

                output[index] = min
            }
        }

        return output
    }
}
