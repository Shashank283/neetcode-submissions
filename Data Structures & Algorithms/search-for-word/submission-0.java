class Solution {
    boolean dfs(int i , int j, int idx , char[][] board , String word){
        if(idx >= word.length()) return true;

        if(i<0 || j< 0 || i>board.length -1 || j> board[0].length -1) return false;

        if(board[i][j] != word.charAt(idx)) return false;

        char temp = board[i][j];

        board[i][j] = '0';

        // This is Backtrackiing
        if(dfs(i+1,j,idx+1 , board , word) || dfs(i-1,j,idx+1 , board , word) || dfs(i,j+1,idx+1 , board , word) || dfs(i,j-1,idx+1 , board , word)) return true;

        board[i][j] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i =0 ; i< m ;i++){
            for(int j =0 ;j<n ;j++){
                if(board[i][j] == word.charAt(0)){
                   if(dfs(i,j,0,board , word)) return true; ;
                }
            }
        }

        return false;
        
    }
}
