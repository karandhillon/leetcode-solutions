class NumMatrix(val matrix: Array<IntArray>) {
    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var sum = 0
        var startR = row1
        var startC = col1
        var endR = row2
        var endC = col2
        
        while (startR <= endR) {
            while(startC <= endC) {
                sum += matrix[startR][startC]
                ++startC
            }
            startC = col1
            ++startR
        }
        
        return sum
    }
}
