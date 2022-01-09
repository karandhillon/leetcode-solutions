class BSTIterator(val root: TreeNode?) {
    private var first: TreeNode? = null
    private var last: TreeNode? = null
  
    init {
      convertToOrdered(root)
    }
  
    private fun convertToOrdered(node: TreeNode?) {
      if (node == null) return
      
      convertToOrdered(node.left)
      
      if (first == null) first = TreeNode(-1).apply { right = node }
      node.left = last
      last?.right = node
      last = node
      
      convertToOrdered(node.right)
    }
  
    fun next(): Int {
      first = first?.right
      return first!!.`val`
    }

    fun hasNext(): Boolean {
      return if (first?.right != null) true else false
    }
}
