class Solution {
    fun simplifyPath(path: String): String {
      val stack = Stack<String>()
      val parts: List<String> = path.split('/')
      
      for (part in parts) {
        when (part) {
          "." -> {}
          "/" -> {}
          ".." -> if (stack.isNotEmpty()) stack.pop()
          else -> {
            if (part.isNotEmpty()) {
              println("pushing $part")
              stack.push(part)
            }            
          }
        }
      }
      
      val components = ArrayList<String>()
      while (stack.isNotEmpty()) {
        components.add(stack.pop())
      }
      
      components.reverse()
      println(components.size)
      
      val sb = StringBuilder()
      components.forEach { component ->
        sb.append("/")
        sb.append(component)
      }
      
      return if (components.size == 0) "/" else sb.toString()
    }
}
