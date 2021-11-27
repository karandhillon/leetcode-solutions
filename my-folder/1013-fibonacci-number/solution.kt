class Solution {
    fun fib(n: Int): Int {
        return dynamic(n)
    }
    
    fun dynamic(n: Int, map: HashMap<Int, Int> = HashMap()): Int {
        if (map.contains(n)) return map.get(n)!!
        if (n == 0) return 0
        if (n == 1) return 1
        map.put(n, fib(n-1) + fib(n-2))
        return map.get(n)!!
    }
}
