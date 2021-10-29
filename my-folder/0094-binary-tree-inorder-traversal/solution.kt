class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        return bfs(root)
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
