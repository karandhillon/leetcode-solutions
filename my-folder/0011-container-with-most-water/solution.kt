class Solution {
    fun maxArea(height: IntArray): Int {
        val arr = height
        
        var i = 0
        var j = arr.size - 1
        var ans = 0
        
        
        while(i<=j) {
            val w = j-i
            val h = if(arr[i]<arr[j]) arr[i] else arr[j]
            
            if(w*h > ans) ans = w*h
            
            if(arr[i]<arr[j]) i++
            else j--
        }
        
        return ans
    }
    
    fun getArea(width: Int, height: Int): Int {
        return width*height
    }
}
