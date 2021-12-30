class Solution {
    
  private int[][] offsets = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
  
  public int numIslands(char[][] grid) {
    int count = 0;
    
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          count++;
        }
      }
    }
    
    return count;
  }
  
  private void dfs(char[][] grid, int row, int col) {
    grid[row][col] = '0';
    
    for (int[] offset : offsets) {
      int nRow = row + offset[0];
      int nCol = col + offset[1];
      
      if (nRow < 0 || nRow >= grid.length || nCol < 0 || nCol >= grid[0].length) {
        continue;
      }
      
      if (grid[nRow][nCol] == '1') {
        dfs(grid, nRow, nCol);
      }
    }
  }
}
