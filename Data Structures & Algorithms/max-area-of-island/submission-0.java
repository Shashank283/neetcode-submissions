class Solution {
    int[][] moves = {{0,-1},{0,1},{1,0},{-1,0}};

    int bfs(int[][] grid, int[][] vis , Queue<int[]> pq, int n , int m){
        int temp =1;
        while(!pq.isEmpty()){
            int[] arr = pq.poll();

            int firstElement = arr[0];
            int secondElement = arr[1];

            for(int checkMoves =0;checkMoves<4;checkMoves++){
                int xCoordinateToMove = firstElement + moves[checkMoves][0]; 
                int yCoordinateToMove = secondElement + moves[checkMoves][1];

                if(xCoordinateToMove<0 || yCoordinateToMove <0 || xCoordinateToMove > n -1 || yCoordinateToMove > m -1  ) continue;

                else{
                    if (vis[xCoordinateToMove][yCoordinateToMove] !=1 && grid[xCoordinateToMove][yCoordinateToMove] ==1){

                        
                        pq.add(new int[]{xCoordinateToMove,yCoordinateToMove});
                        
                        vis[xCoordinateToMove][yCoordinateToMove] =1;
                        temp++;
                }


                } 


            }

            

        }
        return temp;

    }


    public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count =0;

        int[][] vis = new int[n][m];
        // For adding co-ordinates of i,j we are creating a queue
        Queue<int[]> pq = new ArrayDeque<>();

        for(int i = 0;i<n ;i++){
            for(int j =0;j<m ; j++){

                if(grid[i][j] ==1 && vis[i][j] != 1){
                    
                    vis[i][j] =1;
                    pq.add(new int[]{i,j});
                    count = Math.max(bfs(grid,vis,pq,n,m),count);
                }

                
            }
        }

        return count;
        
    }
}
