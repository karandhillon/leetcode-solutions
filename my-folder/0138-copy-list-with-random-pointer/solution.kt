/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null
    
        var originalNode = node
        val map = HashMap<Node, Node>()
        
        while (originalNode != null) {
            val copiedNode = map.getOrPut(originalNode) { Node(originalNode!!.`val`) }         
            originalNode.next?.let {
                copiedNode.next = map.getOrPut(it) { Node(it.`val`) } 
            }                     
            originalNode.random?.let {
                copiedNode.random = map.getOrPut(it) { Node(it.`val`) } 
            }
            
            originalNode = originalNode.next
        }
        
        return map.get(node)!!
    }
}
