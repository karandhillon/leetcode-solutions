/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
fun binaryTreePaths(root: TreeNode?): List<String> {
    val output = ArrayList<String>()

    if (root == null) return output

    dfs(root, "${root.`val`}" , output)

    return output
}

fun dfs(
    node: TreeNode,
    path: String,
    output: ArrayList<String>
) {
    if (node.left == null && node.right == null) { output.add(path) }
    node.left?.let { dfs(it, path + "->${it.`val`}", output) }
    node.right?.let { dfs(it, path + "->${it.`val`}", output) }
}
}
