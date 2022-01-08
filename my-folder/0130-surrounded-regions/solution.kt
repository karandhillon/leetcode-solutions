class Solution {
    fun solve(board: Array<CharArray>): Unit {
      val edges = ArrayList<Pair<Int, Int>>()
      
      for (r in 0 until board.size) {
        edges.add(Pair(r, 0))
        edges.add(Pair(r, board[0].size-1))
      }
      
      for (c in 0 until board[0].size) {
        edges.add(Pair(0, c))
        edges.add(Pair(board.size-1, c))
      }
      
      edges.forEach { edge ->
        dfs(edge.first, edge.second, board)
      }
      
      for (r in 0 until board.size) {
        for (c in 0 until board[0].size) {
          if (board[r][c] == 'O') board[r][c] = 'X'
          else if (board[r][c] == 'C') board[r][c] = 'O'
        }
      }
    }
    
    fun dfs(
      r: Int,
      c: Int,
      board: Array<CharArray>
    ) {
      if (board[r][c] != 'O') return
      
      board[r][c] = 'C'
      
      if (r > 0) dfs(r-1, c, board)
      if (r < board.size-1) dfs(r+1, c, board)
      if (c > 0) dfs(r, c-1, board)
      if (c < board[0].size-1) dfs(r, c+1, board)
    }
}
