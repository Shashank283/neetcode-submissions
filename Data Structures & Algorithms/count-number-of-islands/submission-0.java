class Solution {

    int[][] moves = {{-1,0},{1,0},{0,-1},{0,1}};

    void bfs(char[][] grid, Queue<int[]> pq, int[][] vis, int n, int m){
        while(!pq.isEmpty()){
            int[] arr = pq.poll();

            int first = arr[0];
            int second = arr[1];

            for(int k = 0; k < 4; k++){
                int p = first + moves[k][0];
                int q = second + moves[k][1];

                if(p < 0 || q < 0 || p >= n || q >= m){
                    continue;
                }
                else{
                    if(grid[p][q] == '1' && vis[p][q] != 1){
                        pq.add(new int[]{p,q});
                        vis[p][q] = 1;
                    }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] vis = new int[n][m];
        Queue<int[]> pq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    count++;
                    vis[i][j] = 1;
                    pq.add(new int[]{i,j});
                    bfs(grid, pq, vis, n, m);
                }
            }
        }

        return count;
    }
}