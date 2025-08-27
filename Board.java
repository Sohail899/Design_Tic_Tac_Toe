public class Board {
    private PieceType[][] grid;

    //constructor
    public Board(){
        grid = new PieceType[3][3];
    }

    public void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]==null){
                    System.out.print(" . ");
                }
                else{
                    System.out.print(" " + grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean addMove(int row, int col, PieceType piece){
        if(row<0 || row>=3 || col<0 || col>=3 || grid[row][col] != null){
            System.out.println("Invalid move! Try again.");
            return false;
        }
        grid[row][col]=piece;
        return true;
    }

    public boolean checkRow() {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != null && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn() {
        for (int i = 0; i < 3; i++) {
            if (grid[0][i] != null && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal() {
        if (grid[0][0] != null && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        }
        if (grid[0][2] != null && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
