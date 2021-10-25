class Solution {
fun lengthOfLongestSubstring(s: String): Int {
    val hashSet = HashSet<Char>()
    var startingPointer = 0
    var endingPointer = 0
    var max = 0

    while (endingPointer < s.length) {
//        does not contain
        if (!hashSet.contains(s[endingPointer])) {
            hashSet.add(s[endingPointer])
            endingPointer++
            max = maxOf(hashSet.size, max)
        }
//        contains
        else {
            hashSet.remove(s[startingPointer])
            startingPointer++
        }
    }

    return max
}
}
