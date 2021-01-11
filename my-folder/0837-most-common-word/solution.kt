class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val hashMap = HashMap<String, Int>()
        var paragraph = paragraph.split(" ", ",", ignoreCase = true)        
        
        for (word in paragraph) {
            val re = Regex("[^A-Za-z0-9 ]")
            
            val cleanWord = word.replace(re, "").toLowerCase()
            
            if(!banned.contains(cleanWord) && cleanWord.isNotEmpty()) {
                if(hashMap.get(cleanWord) == null) hashMap.put(cleanWord, 1)
                else hashMap.put(cleanWord, hashMap.get(cleanWord)!! + 1)
            } 
        }
    
        
    
        return hashMap.maxBy {it.value}!!.key
    }
}
