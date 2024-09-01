package Week6;
//ques 36 leet imp
public class sudukoques {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    if(board[i][j]!='.'){
                    if(!checkValid(board,i,j))
                        return false;
                    }
          return true;
       }
    
        static boolean checkValid(char [][] b,int i, int j){
            //Row & columns
        for(int k=0;k<9;k++){
            if(k!=i && k!=j){
                if(b[i][j]==b[k][j] || b[i][j]==b[i][k])
                return false;
            }
        }
    
        int n=b.length;
        int root_n=(int)Math.sqrt(n);
        int ri=(i/root_n)*root_n;//learn this root condition to find the edge block of a square in suduko
        int rj=(j/root_n)*root_n;
        for(int x=ri;x<ri+root_n;x++){//root_n or 3 same thing 
            for(int y=rj;y<rj+root_n;y++){
                if(x!=i && y!=j){
                    if(b[x][y]==b[i][j])
                    return false;
                }
            }
        }
          return true;        
                    
        }
    }
}
