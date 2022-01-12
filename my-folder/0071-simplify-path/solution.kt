class Solution {
    fun simplifyPath(path: String): String {
      val stack = Stack<String>()
      val components = path.split("/")
      
      for (directory in components) {
        if (directory == "." || directory.isEmpty()) continue
        else if (directory == "..") { if (stack.isNotEmpty()) stack.pop() }
        else stack.push(directory)
      }
      
      val sb = StringBuilder()
      for (directory in stack) {
        sb.append("/")
        sb.append(directory)
      }
      
      return if (sb.length > 0) sb.toString() else "/"
    }
}
