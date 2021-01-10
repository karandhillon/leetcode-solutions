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
        val paths = ArrayList<String>()
        if(root != null) constructPaths(root!!, "", paths)
        return paths
    }
    
    fun constructPaths(root: TreeNode?, path: String, paths: ArrayList<String>) {
        if(root != null) {
            if(root.left == null && root.right == null) paths.add("$path" + "${root.`val`}")
            else {
                constructPaths(root.left, "$path" + "${root.`val`}" + "->", paths)
                constructPaths(root.right, "$path" + "${root.`val`}" + "->", paths)
            }
        }
    }
}
