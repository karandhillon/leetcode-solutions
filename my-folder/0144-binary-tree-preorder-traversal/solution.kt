class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val output = ArrayList<Int>()
        
        dfs(root, output)
        
        return output
    }
    
    fun dfs(node: TreeNode?, output: ArrayList<Int>) {
        if (node == null) return
        
        output.add(node.`val`)
        dfs(node.left, output)
        dfs(node.right, output)
    }
}
