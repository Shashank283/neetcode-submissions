class Solution {

    int[][] moves = {{-1,0},{0,1},{1,0},{0,-1}};

    
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new  int[n][m];
        int fresh =0;
        int maxtime = 0;

        Queue<int[]> pq = new ArrayDeque<>();

        for(int i =0;i<n;i++){
            for(int j = 0;j<m ;j++){
                if(grid[i][j] ==1) fresh++;
                if(grid[i][j] ==2){
                    pq.add(new int[]{i,j,0});
                    vis[i][j] =1;
                    // maxtime = Math.max(bfs(grid,vis,n,m,pq,fresh),maxtime);

                }
            }

        }

        
        while(!pq.isEmpty()){
            int[] arr = new int[3];

            arr = pq.poll();
            int first = arr[0];
            int second = arr[1];
            int time = arr[2];
            

            for(int k =0;k<moves.length ; k++){
                int p = first + moves[k][0];
                int q = second + moves[k][1];

                if(p < 0 || q<0 || p>=n || q>=m){
                    continue;
                }
                else{
                    if(grid[p][q] ==1 && vis[p][q] !=1){
                        pq.add(new int[]{p,q,time+1});
                        vis[p][q] =1;
                        fresh--;
                    }
                }

            }
            maxtime = Math.max(time,maxtime);

        }


        if(fresh != 0){
            return -1;
        }
        else{
            return maxtime;
        }
        
    }
}
