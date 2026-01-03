class Solution {
    fun fillCups(amount: IntArray): Int {
        var counter = 0

        while (
            amount[0] > 0
            || amount[1] > 0
            || amount[2] > 0
        ) {
            amount.sort()

            when {
                amount[1] > 0 && amount[2] > 0 -> {
                    amount[1] -= 1
                    amount[2] -= 1

                    ++counter
                    
                    continue
                }
                amount[0] > 0 -> {
                    amount[0] -= 1

                    ++counter

                    continue
                }
                amount[1] > 0 -> {
                    amount[1] -= 1

                    ++counter

                    continue
                }
                amount[2] > 0 -> {
                    amount[2] -= 1
                    
                    ++counter

                    continue
                }
            }
        }

        return counter
    }
}
