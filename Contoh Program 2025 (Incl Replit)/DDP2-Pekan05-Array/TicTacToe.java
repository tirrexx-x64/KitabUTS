public class TicTacToe {
    /*
     * return
     * 1: X Menang
     * 2: O Menang
     * 3: Seimbang
     * 0: Belum selesai
     */
    public static int checkStatus(int[][] tictactoe){

        // baris
        for(int i=0;i<3;i++){
            if(tictactoe[i][0]==tictactoe[i][1] 
                && tictactoe[i][1]==tictactoe[i][2])
                if(tictactoe[i][0]==1)
                    return 1;   // X Menang
                else 
                    if (tictactoe[i][0]==-1)
                        return 2; // O Menang
        }
        // kolom
        for(int j=0;j<3;j++){
            if(tictactoe[0][j]==tictactoe[1][j] 
                && tictactoe[1][j]==tictactoe[2][j])
                if(tictactoe[0][j]==1)
                    return 1;   // X Menang
                else 
                    if (tictactoe[0][j]==-1)
                        return 2; // O Menang
        }
        // diagonal kiri atas kanan bawah
        if(tictactoe[0][0]==tictactoe[1][1] 
            && tictactoe[1][1]==tictactoe[2][2])
            if(tictactoe[1][1]==1)
                return 1;   // X Menang
            else 
                if (tictactoe[1][1]==-1)
                    return 2; // O Menang        

        // diagonal kiri atas kanan bawah
        if(tictactoe[0][2]==tictactoe[1][1] 
            && tictactoe[1][1]==tictactoe[2][0])
            if(tictactoe[1][1]==1)
                return 1;   // X Menang
            else 
                if (tictactoe[1][1]==-1)
                    return 2; // O Menang        

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (tictactoe[i][j]==0)
                    return 0; // Belum Selesai
            }
        }
        
        return 3; // Seimbang
    }
}
