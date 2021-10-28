/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l3 = ListNode(0) // Adding ListNode(0) placeholder
        var l3Head = l3
        var l1Head = l1
        var l2Head = l2
        var carry = 0
        
        while (l1Head != null || l2Head != null) {
            val l1Val = l1Head?.`val` ?: 0
            val l2Val = l2Head?.`val` ?: 0
            
            val sum = l1Val + l2Val + carry
            carry = sum / 10
            val digit = sum % 10
            
            l3Head.next = ListNode(digit)
            l3Head = l3Head.next

            if (l1Head != null) l1Head = l1Head.next
            if (l2Head != null) l2Head = l2Head.next
        }
        
        if (carry != 0) l3Head.next = ListNode(1)
        
        l3 = l3.next // Removing ListNode(0) placeholder
        
        return l3
    }
}
