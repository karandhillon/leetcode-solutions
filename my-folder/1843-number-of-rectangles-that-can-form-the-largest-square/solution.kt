class Solution {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        var maxLength = 0
        var maxLengthCounter = 0

        for (rectangle in rectangles) {
            val min = Math.min(rectangle[0], rectangle[1])

            if (maxLength <= min) {
                if (maxLength == min) {
                    ++maxLengthCounter
                } else {
                    maxLengthCounter = 1
                }

                maxLength = min
            }
        }

        return maxLengthCounter
    }
}
