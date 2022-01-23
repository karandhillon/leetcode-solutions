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
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
      if (root == null) return emptyList()
      
      val output = ArrayList<ArrayList<Int>>()
      dfs(root, 0, targetSum, arrayListOf(), output)
      
      return output
    }
    
    fun dfs(
      node: TreeNode?,
      sum: Int,
      targetSum: Int,
      list: ArrayList<Int>,
      output: ArrayList<ArrayList<Int>>
    ) {
      if (node == null) return
      if (node.left == null && node.right == null) {
        if (sum + node.`val` == targetSum) {
          list.add(node.`val`)
          output.add(list)
        }
        
        return
      }
      
      list.add(node.`val`)
      dfs(node.left, sum + node.`val`, targetSum, ArrayList(list), output)
      dfs(node.right, sum + node.`val`, targetSum, ArrayList(list), output)
    }
}
