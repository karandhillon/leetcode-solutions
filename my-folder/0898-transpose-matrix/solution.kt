class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val output = Array<IntArray>(matrix[0].size) { IntArray(matrix.size) }

        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[0].size) {
                output[j][i] = matrix[i][j]
            }
        }

        return output
    }
}
