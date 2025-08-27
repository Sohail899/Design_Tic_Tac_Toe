import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Game {
    private Board board;
    private Queue<Player> players;

    public Game(){
        board = new Board();
        players = new LinkedList<>();
    }

    public void initializeGame(){
        Player player1 = new Player("Sohail", PieceType.X);
        Player player2 = new Player("Gaurav", PieceType.O);
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){


        while(true){
            Player p = players.poll();
            board.printBoard();

            // int[] move = p.getMove();
            // boolean validMove = board.addMove(move[0], move[1], p.getPieceType());

            System.out.println(p.getName() + " (" + p.getPieceType() + "), enter your move (row and col between 0 and 2):");

            // if(!validMove){
            //     System.out.println("Invalid move! Try again.");
            //     players.add(p);
            //     continue;
            // }
            Scanner sc = new Scanner(System.in);

            int row;
            int col;
            while(true){
                row = sc.nextInt();
                col = sc.nextInt();
                if(board.addMove(row,col,p.getPieceType())){
                    break;
                }
                else {
                    System.out.println("Invalid move! Try again:");
                }
            }

            if(checkWinner()){
                board.printBoard();
                System.out.println(p.getName() + " wins!");
                break;
            }

            if(board.isFull()){
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            players.add(p);
        }
    }

    private boolean checkWinner() {
        return board.checkRow() || board.checkColumn() || board.checkDiagonal();
    }
}
