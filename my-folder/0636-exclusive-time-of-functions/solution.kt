class Solution {
    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
      val output = IntArray(n) { 0 }
      val stack = Stack<Triple<Int, String, Int>>()
      
      for (log in logs) {
        val splits = log.split(":")
        val id = splits.get(0).toInt()
        val cmd = splits.get(1)
        val time = splits.get(2).toInt()
        
        if (cmd == "end") {
          val popped = stack.pop()
          output[id] += time - popped.third + 1
          
          if (stack.isNotEmpty()) {
            output[stack.peek().first] -= time - popped.third + 1
          }
        } else stack.push(Triple(id, cmd, time))
      }
      
      return output
    }
}
