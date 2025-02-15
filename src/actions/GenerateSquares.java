package actions;

import constants.Constants;
import model.Square;

public class GenerateSquares {
  
  private static final String[] input = {"I", "T", "V", "I", "A", "C", "R", "A", "Y/U", "D", "B", "S", "D", "O", "T", "O"};
  
  public static Square[][] generateSquares() {
    Square[][] squares = new Square[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    
    int w = 0;
    for (int i = 0; i < squares.length; i++) {
        for (int j = 0; j < squares[i].length; j++) {
            String letter = input[w];
            w++;
            squares[i][j] = new Square(letter, i, j);
        }
    }
    printInput(squares);
    return squares;
  }
  
  private static void printInput(Square[][] squares) {
    for (int i = 0; i < squares.length; i++) {
        for (int j = 0; j < squares[i].length; j++) {
            System.out.print("[" + squares[i][j].getLetter() + (squares[i][j].isOptionalLetter() ? "/" + squares[i][j].getSecondLetter() : "") + "] ");
        }
        System.out.println();
    }
}

}
