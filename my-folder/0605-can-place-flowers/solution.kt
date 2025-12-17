class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var counter = 0

        for (i in 0..flowerbed.size - 1) {
            val prev = flowerbed.getOrElse(i - 1) { 0 }
            val next = flowerbed.getOrElse(i + 1) { 0 }

            if (prev == 0 && next == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1
                ++counter
            }
        }

        return counter >= n 
    }
}
