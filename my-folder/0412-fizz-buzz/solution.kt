class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val list = arrayListOf<String>()
        val map = HashMap<Int, String>().apply {
            put(3, "Fizz")
            put(5, "Buzz")
        }

        for (i in 1..n) {
            var result = ""
            var flag = false

            if (i % 3 == 0) {
                result += "Fizz"
                flag = true
            }

            if (i % 5 == 0) {
                result += "Buzz"
                flag = true
            }

            if (!flag) {
                result += i.toString()
            }

            list.add(result)
        }

        return list
    }
}
