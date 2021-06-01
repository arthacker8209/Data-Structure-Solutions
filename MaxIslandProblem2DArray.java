class Solution{
  public int maxAreaOfIsland(int[][] grid){
  int curr=0, res=0;
  
  for(int i = 0; i<grid.length; i++){
    for(int j = 0 ; j< grid[0].length; j++){
    if(grid[i][j]==1){
    curr= bfs(grid, i , j );
    res= Math.max(res, curr);
    } 
    }
  } 
  return res;
  
  }
  
  private int bfs(int[][] grid, int k, int l){
  Queue<int[]> q = new LinkedList<>();
  q.offer(new int[]{k, l});
  int res=0;
  while(!q.isEmpty()){
      int curr= q.poll();
      res++;
      int[][] neighbour= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
      for(int[] n : neighbour){
      int i = curr[0]+n[0];
      int j = curr[1]+n[1];
      
      if(i>=0 && i< grid.length && j>=0 && j<grid[0].length && grid[i][j]==1){
        grid[i][j]=0;
        q.offer(new int[]{i, j });
      }
      
      } 
    }
    return res;
  }

}
