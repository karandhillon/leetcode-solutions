class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
      var totalIslands = 0
      val visited = mutableSetOf<String>()
      
      for(i in 0 until grid.size) {
        for (j in 0 until grid[0].size) {
          if(visitIsland(grid, i, j, visited)) totalIslands++
        }
      }
      
      return totalIslands
    }
    
    fun visitIsland(
      grid: Array<CharArray>,
      row: Int,
      col: Int,
      visited: MutableSet<String>
    ): Boolean {
      val currentPosition = "$row,$col"
      
      val rowInbounds = 0 <= row && row < grid.size
      val colInbounds = 0 <= col && col < grid[0].size
      
      if(!rowInbounds || !colInbounds) return false
      
      if(grid[row][col] == '0') return false
      if(visited.contains(currentPosition)) return false
      
      visited.add(currentPosition)
      
      visitIsland(grid, row-1, col, visited)
      visitIsland(grid, row+1, col, visited)
      visitIsland(grid, row, col-1, visited)
      visitIsland(grid, row, col+1, visited)
      
      return true
    }
}

// "1","1","1","1","0"
// "1","1","0","1","0"
// "1","1","0","0","0"
// "0","0","0","0","0"
