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
    fun isValidBST(root: TreeNode?): Boolean {
        return validate(root, null, null)
    }
    
    fun validate(node: TreeNode?, min: Int?, max: Int?): Boolean {
        if(node == null) return true
        if(
            (min != null && node.`val` <= min) ||
            (max != null && node.`val` >= max)
        ) return false
        
        if(
            !validate(node.left, min, node.`val`) ||
            !validate(node.right, node.`val`, max)
        ) return false
        else return true
    } 
}
