class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < mat.length; i++) {
          for (int j = 0; j < mat[0].length; j++) {
             map.putIfAbsent(i + j, new ArrayList<>()); 
             map.get(i + j).add(mat[i][j]);
          }
        }
        
        
        int[] result = new int[mat.length * mat[0].length];
        int index = 0;
        for (int i = 0; i <= mat.length + mat[0].length - 2; i++) {
          List<Integer> list = map.get(i);
          
          if (i % 2 == 0) {
            for (int j = list.size() - 1; j >= 0; j--) {
              result[index++] = list.get(j);
            }
          } else {
            for (int x = 0; x < list.size(); x++) {
              result[index++] = list.get(x);
            }
          }
        }
        
        
        return result;
    }
}
