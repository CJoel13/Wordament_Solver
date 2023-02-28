package process;

import model.Board;

/**
 * Class that orchestrates call to create initial state of board.
 * @author joel1
 *
 */
public class Initialize {
	
	private IterateBoard iterateBoard;
	
	public Initialize() {
		Board board = new Board();
		iterateBoard = new IterateBoard(board);
	}
	
	public void init() {
		iterateBoard.iterate();
	
	}
	
	public static void main(String[] args) {
		Initialize start = new Initialize();
		start.init();
	}
}
