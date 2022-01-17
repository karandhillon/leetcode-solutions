/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var l = 1
        var r = n

        while (l <= r) {
            val m = l + (r - l) / 2
          
            if (isBadVersion(m)) r = m - 1
            else l = m + 1
        }
        
        return l
    }
}
