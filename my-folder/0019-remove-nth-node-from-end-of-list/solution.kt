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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
      val dummy: ListNode? = ListNode(-1).apply { next = head }
      var first = dummy
      var second = dummy
      
      for (i in 0 until n+1) {
        first = first?.next
      }
      
      while (first != null) {
        first = first?.next
        second = second?.next
      }
      
      second?.next = second?.next?.next
      
      return dummy?.next
    }
}
