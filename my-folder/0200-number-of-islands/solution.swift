class Solution {
  
    var visited = Set<[Int]>()
  
    func numIslands(_ grid: [[Character]]) -> Int {
        
         var result = 0
      
         for row in 0..<grid.count{
          for col in 0..<grid[0].count{
               if grid[row][col] == "1" && !visited.contains([row, col]){
                 dfs(row, col, grid)
                 result += 1
               }
          }
         }
      
      return result
    }
  
     func dfs(_ row : Int, _ col : Int, _ grid : [[Character]]){
            if row < 0 || row >= grid.count || col < 0 || col >= grid[0].count || visited.contains([row, col]) || grid[row][col] == "0"{
                return 
            }
            
            visited.insert([row, col])
       
            dfs(row+1, col, grid)
            dfs(row-1, col, grid)
            dfs(row, col+1, grid)
            dfs(row, col-1, grid)
           
     }
}
