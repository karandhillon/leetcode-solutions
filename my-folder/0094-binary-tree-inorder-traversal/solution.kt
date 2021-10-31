class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        return dfs(root)
    }

    fun dfs(root: TreeNode?): List<Int> {
        val output = ArrayList<Int>()
        
        dfsHelper(root, output)
            
        return output
    }
    
    fun dfsHelper(node: TreeNode?, output: ArrayList<Int>) {
        if (node == null) return
        else {
            node.left?.let { dfsHelper(it, output) }
            output.add(node.`val`)
            node.right?.let { dfsHelper(it, output) }
        }
    }
    
    fun bfs(root: TreeNode?): List<Int> {
        val stack = Stack<TreeNode>()
        val output = ArrayList<Int>()

        return if (root == null) output
        else {
            var current: TreeNode? = root

            while (stack.isNotEmpty() || current != null) {
                while (current != null) {
                    stack.push(current)
                    current = current.left
                }

                val popped = stack.pop()
                output.add(popped.`val`)
                current = popped.right
            }

            output
        }
    }
}
