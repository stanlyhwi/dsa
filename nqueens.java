import java.util.*;
public class nqueens {
    final int N = 4;
    void printSolution(int chessboard[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)


                System.out.print(" " + chessboard[i][j]
                                + " ");
            System.out.println();
        }
    }

   
    boolean issafetoplace(int chessboard[][], int row, int col)
    {
        int i, j;

        
        for (i = 0; i < col; i++)
            if (chessboard[row][i] == 1)
                return false;

    
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (chessboard[i][j] == 1)
                return false;

        
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (chessboard[i][j] == 1)
                return false;

        return true;
    }
    boolean solveNQUtil(int chessboard[][], int col)
    {
        
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {     
            if (issafetoplace(chessboard, i, col)) {
                
                chessboard[i][col] = 1;
                if (solveNQUtil(chessboard, col + 1) == true){
                    return true;
                }
                chessboard[i][col] = 0; // BACKTRACK
            }
        }
        
        return false;
    }
    boolean solveNQ()
    {
        int chessboard[][] = { { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 } };

        if (solveNQUtil(chessboard, 0) == false) {
           System.out.print("Solution not found");
            return false;
        }

        printSolution(chessboard);
        return true;
    }

    
    public static void main(String args[])
    {
        nqueens Queen = new nqueens();
        Queen.solveNQ();
    }
}