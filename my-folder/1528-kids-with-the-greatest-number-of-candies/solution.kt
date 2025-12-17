class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val output = ArrayList<Boolean>()

        var max = 0

        for (candy in candies) {
            max = Math.max(max, candy)
        }

        for (candy in candies) {
            if (candy + extraCandies >= max) {
                output.add(true)
            } else {
                output.add(false)
            }
        }

        return output       
    }
}
