import java.util.Scanner;

public class Player {

    private String name;
    private PieceType pieceType;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    // getter and setters
    public String getName() {
        return name;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    // public int[] getMove() {
    //     Scanner scanner = new Scanner(System.in);
    //     int row = -1, col = -1;
    //     try {
    //         System.out.print(name + " (" + pieceType + "), enter your move (row and col between 0 and 2): ");
    //         row = scanner.nextInt();
    //         col = scanner.nextInt();
    //     } catch (Exception e) {
    //         System.out.println("Invalid input. Please enter two numbers between 0 and 2.");
    //     }
    //     return new int[] { row, col };
    // }

}
