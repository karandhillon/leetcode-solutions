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
//   l       m     r
// [-10, -3, 0, 5, 9]
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
      var l = 0
      var r = nums.size-1
      
      return bs(nums, l, r)
    }
    
    fun bs(
      nums: IntArray,
      start: Int,
      end: Int
    ): TreeNode? {
      if (start > end) return null
      
      val m = start + (end-start)/2
      
      val node = TreeNode(nums[m])
      node.left = bs(nums, start, m-1)
      node.right = bs(nums, m+1, end)
      
      return node
    }
}
