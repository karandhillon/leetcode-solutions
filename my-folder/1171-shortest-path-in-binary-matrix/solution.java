class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
      int[][] offsets = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
      
      if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
        return -1;
      }
      
      boolean[][] visited = new boolean[grid.length][grid[0].length];
      
      Queue<int[]> q = new LinkedList<>();
      q.offer(new int[] {0, 0, 1});
      visited[0][0] = true;
      
      while (!q.isEmpty()) {
        int[] polledItem = q.poll();
        int polledRow = polledItem[0];
        int polledCol = polledItem[1];
        int polledSteps = polledItem[2];
        
        if (polledRow == grid.length - 1 && polledCol == grid[0].length - 1) {
          return polledSteps;
        }
        
        for (int[] offset : offsets) {
          int nRow = polledRow + offset[0];
          int nCol = polledCol + offset[1];
          
          if (nRow < 0 || nRow >= grid.length || nCol < 0 || nCol >= grid[0].length) {
            continue;
          }
          
          if (grid[nRow][nCol] == 0 && !visited[nRow][nCol]) {
            q.offer(new int[] {nRow, nCol, polledSteps + 1});
            visited[nRow][nCol] = true;
          }
        }
      }
      
      return -1;
    }
}
