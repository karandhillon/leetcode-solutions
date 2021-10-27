class Solution {
    var maxDepth = 1

    fun maxDepth(root: Node?): Int {
        if (root == null) return 0

        getMaxDepth(root, 1)

        return maxDepth
    }

    fun getMaxDepth(node: Node?, depth: Int) {
        if (node == null) return

        maxDepth = Math.max(depth, maxDepth)

        node.children.forEach { child ->
            child?.let { getMaxDepth(it, depth + 1) }
        }
    }
}
