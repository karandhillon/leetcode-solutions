/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        
        val map = HashMap<Int, Node>()
        helper(node, map)
    
        return map.get(1)!!
    }
    
    fun helper(node: Node?, map: HashMap<Int, Node>) {
        if (node == null) return
        
        val newNode = map.getOrPut(node.`val`) { Node(node.`val`) }
        node.neighbors.forEach { neighbor ->
            if (!map.contains(neighbor?.`val`)) helper(neighbor, map)
            newNode.neighbors.add(map.get(neighbor?.`val`)!!)
        }
    }
}
