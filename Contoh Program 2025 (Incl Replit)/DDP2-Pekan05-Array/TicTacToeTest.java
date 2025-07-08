import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {
    @Test
    public void testX_01(){
        int[][] tictactoe = {{ 1, 1, 1},
                             { 0, 1,-1},
                             { 0,-1,-1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testX_02(){
        int[][] tictactoe = {{-1, 1, 1},
                             { 1, 1, 1},
                             {-1, 0,-1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testX_03(){
        int[][] tictactoe = {{-1, 1,-1},
                             { 1,-1, 1},
                             { 1, 1, 1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }

    @Test
    public void testX_04(){
        int[][] tictactoe = {{ 1, 1,-1},
                             { 1,-1, 1},
                             { 1,-1, 1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testX_05(){
        int[][] tictactoe = {{-1, 1,-1},
                             { 1, 1,-1},
                             {-1, 1, 1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testX_06(){
        int[][] tictactoe = {{-1, 1, 1},
                             { 1,-1, 1},
                             {-1, 1, 1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testX_07(){
        int[][] tictactoe = {{ 0, 0, 1},
                             { 0, 1,-1},
                             { 1,-1,-1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test 
    public void testX_08(){
        int[][] tictactoe = {{ 1, 0, 1},
                             { 0, 1,-1},
                             { 0,-1, 1}};
        int jawab = 1;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
 


    @Test
    public void testO_01(){
        int[][] tictactoe = {{-1,-1,-1},
                             { 0, 1, 1},
                             { 1, 0, 1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testO_02(){
        int[][] tictactoe = {{ 0,-1, 1},
                             {-1,-1,-1},
                             { 0, 1,-1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testO_03(){
        int[][] tictactoe = {{ 0, 1,-1},
                             { 1, 0, 1},
                             {-1,-1,-1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }

    @Test
    public void testO_04(){
        int[][] tictactoe = {{-1, 1,-1},
                             {-1, 0, 1},
                             {-1,-1, 1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testO_05(){
        int[][] tictactoe = {{ 0,-1, 0},
                             { 1,-1,-1},
                             { 0,-1, 1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testO_06(){
        int[][] tictactoe = {{ 0, 1,-1},
                             { 1, 0,-1},
                             {-1, 1,-1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }

    @Test
    public void testO_07(){
        int[][] tictactoe = {{ 0, 0,-1},
                             { 0,-1, 1},
                             {-1, 1, 1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
    @Test
    public void testO_08(){
        int[][] tictactoe = {{-1, 0,-1},
                             { 0,-1, 1},
                             { 1, 1,-1}};
        int jawab = 2;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }

    @Test
    public void test_belum(){
        int[][] tictactoe = {{-1, 0,-1},
                             { 0,-1, 1},
                             { 1, 1, 0}};
        int jawab = 0;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }

    @Test
    public void test_seimbang(){
        int[][] tictactoe = {{-1, 1,-1},
                             {-1, 1, 1},
                             { 1,-1, 1}};
        int jawab = 3;
        assertEquals(jawab, TicTacToe.checkStatus(tictactoe));   
    }
}
