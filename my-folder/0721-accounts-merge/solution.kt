class Solution {
    fun accountsMerge(accounts: List<List<String>>): List<List<String>> {
      val uf = UnionFind(accounts.size)
      
      val emailToId = HashMap<String, Int>()
      for (i in 0 until accounts.size) {
        val account = accounts[i]

        for (j in 1 until account.size) {
          val email = account[j]
          
          if (emailToId.contains(email)) uf.union(i, emailToId.get(email)!!)
          else emailToId.put(email, i)
        }
      }
      
      val idToEmails = HashMap<Int, ArrayList<String>>()
      for ((key, value) in emailToId.entries) {
        val parent = uf.find(value)
        
        idToEmails.getOrPut(parent) { ArrayList<String>() }.add(key)
      }
      
      val output = ArrayList<ArrayList<String>>()
      for ((key, value) in idToEmails.entries) {
        val emails = value
        Collections.sort(emails)
        emails.add(0, accounts.get(key).get(0))
        output.add(emails)
      }
      
      return output
    }
}

class UnionFind(val size: Int) {
  private val parent = IntArray(size)
  private val weight = IntArray(size)
  
  init {
    for (i in parent.indices) {
      parent[i] = i
      weight[i] = 1
    }
  }
  
  fun find(a: Int): Int {
    if (parent[a] == a) return a
    
    parent[a] = find(parent[a])
    
    return parent[a]
  }
  
  fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)
    
    if (aParent == bParent) return
    
    if (weight[aParent] > weight[bParent]) {
      parent[bParent] = aParent
      weight[aParent] += weight[bParent]
    } else {
      parent[aParent] = bParent
      weight[bParent] += weight[aParent]
    }
  }
}

