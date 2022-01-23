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
    fun deleteDuplicates(head: ListNode?): ListNode? {
      if (head == null) return null
      
      var p = ListNode(-101).apply { next = head }
      var start = p
      var c = head
      
      while (c != null) {
        if (c.`val` == c.next?.`val`) {
          while (c.`val` == c.next?.`val`) {
            c.next = c.next?.next
          }
          
          p.next = c.next
          c = c.next
        }
        else {
          p = c
          c = c.next
        }
      }
      
      return start.next
    }
}
