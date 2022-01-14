class RandomizedSet() {
  val set = HashSet<Int>()
  
    fun insert(`val`: Int): Boolean {
      return if (set.contains(`val`)) false
      else {
        set.add(`val`)
        true
      }
    }

    fun remove(`val`: Int): Boolean {
      return if (set.contains(`val`)) {
        set.remove(`val`)
        true
      } else {
        false
      }
    }

    fun getRandom(): Int {
      val random = Random().nextInt(set.size)
      val iterator = set.iterator()
      
      for (i in 0 until random) {
        iterator.next()
      }
      
      return iterator.next()
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */
