class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val output = mutableListOf<List<Int>>()

        for (i in 0..numRows-1) {
            if (i == 0) {
                output.add(mutableListOf(1))
            } else if (i == 1) {
                output.add(mutableListOf(1, 1))
            } else {
                val inner = mutableListOf<Int>()

                for (j in 0..i) {
                    val prevRow = output.getOrElse(i-1) { mutableListOf() }

                    inner.add(
                        prevRow.getOrElse(j-1) {0} + 
                        prevRow.getOrElse(j) {0}
                    )                
                }

                output.add(inner)
            }
            
        }

        println(output.toString())

        return output
    }
}
