package process;

import model.Board;
import model.Square;

/**
 * Class that orchestrates call to create initial state of board.
 * @author joel1
 *
 */
public class Initialize {
	
	private IterateBoard iterateBoard;
	
	public Initialize() {
		iterateBoard = new IterateBoard();
	}
	
	public void init() {
		Board board = new Board();
//		Square[][] squares = board.getSquares();
		iterateBoard.iterate(board);
		
		
	}
	
	

}
