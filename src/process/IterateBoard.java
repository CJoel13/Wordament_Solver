package process;

import java.util.ArrayList;
import java.util.List;

import constants.Constants;
import model.Board;
import model.Coord;
import model.Square;
import model.Word;

public class IterateBoard {

	public void iterate(Board board) {

		Square[][] squares = board.getSquares();
		List<Word> words = new ArrayList<>();
		List<Coord> usedCoords = new ArrayList<>();

		/**
		 * Iterate board
		 */
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				
				Square current = squares[i][j];
				usedCoords.clear();
				usedCoords.add(current.getCoord());
				/**
				 * Call to findWords routine
				 */

			}
		}
	}

}
