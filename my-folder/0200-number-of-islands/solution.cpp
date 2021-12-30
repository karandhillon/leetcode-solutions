const int dx[] = {-1, +1, +0, +0};
const int dy[] = {+0, +0, -1, +1};
class Solution {
public:
  vector < vector <bool > > vis;
  void dfs(int ux, int uy, vector < vector <char>>& grid){
    int i, j, n = grid.size(), m = grid[0].size();
    vis[ux][uy] = true;
    
    for(i = 0; i < 4; ++i){
      int vx = ux + dx[i];
      int vy = uy + dy[i];
      if(vx >= 0 && vx < n && vy >= 0 && vy < m && grid[vx][vy] == '1' && !vis[vx][vy]){
        dfs(vx, vy, grid);
      }
    }
  }
  int numIslands(vector<vector<char>>& grid) {
    if(grid.empty()) return 0;     
    int i, j, n = grid.size(), m = grid[0].size(), island_count = 0;
    vis = vector < vector <bool > > (n, vector <bool > (m, false));
    for(i = 0; i < n; ++i){
      for(j = 0; j < m; ++j){
        if(grid[i][j] == '1' && !vis[i][j]){
          dfs(i, j, grid);
          island_count++;
        }
      }
    }
    return island_count;
  }
// ["1","1","1","1","0"],
// ["1","1","0","1","0"]
// ["1","1","0","0","0"],
// ["0","0","0","0","0"]
// (i = 0, j = 0)
// (i = 0, j = 1)
};
