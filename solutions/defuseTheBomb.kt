class Solution {
    fun decrypt(code: IntArray, k: Int): IntArray {
        var R = 0
        var windowSum = 0
        val result = IntArray(code.size)

        return when {
            k < 0 -> {
                code.forEachIndexed { index, value ->
                    R = index - 1
                    
                    for (i in 0 until Math.abs(k)) {
                        if (R < 0) {
                            R = code.size - 1
                        }          
                        
                        windowSum += code[R]

                        --R
                    }

                    result[index] = windowSum
                    windowSum = 0
                }

                result
            }
            k > 0 -> {
                code.forEachIndexed { index, value ->
                    R = index + 1

                    for (i in 0 until k) {
                        if (R > code.size - 1) {
                            R = 0
                        }

                        windowSum += code[R]

                        ++R
                    }

                    result[index] = windowSum
                    windowSum = 0
                }

                result
            }
            else -> { IntArray(code.size) { 0 } }
        }  
    }
}
