class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var answer = false
        
        matrix.forEach { intArray ->
            intArray.forEach { int ->
                if (int == target) answer = true
            }
        }
        
        return answer
    }
}
