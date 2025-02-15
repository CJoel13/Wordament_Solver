package process;

import actions.GenerateSquares;
import model.Board;
import model.Square;

/**
 * Class that orchestrates call to create initial state of board.
 * TODO: Initialize should be moved to "Solver"
 * @author joel1
 *
 */
public class Initialize {
	
	private IterateBoard iterateBoard;
	
	/**
	 * Get input from CLI: new ReadInput().readInput();
	 */
	public Initialize() {
	  Square[][] squares = GenerateSquares.generateSquares();
	  Board board = new Board(squares);
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
