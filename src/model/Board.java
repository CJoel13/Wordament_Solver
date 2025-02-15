package model;

import java.util.Map;

public class Board {
	
	private Square[][] squares;
	
	public Board(Square[][] squares) {
	  this.squares = squares;
	}

	public Square[][] getSquares() {
		return squares;
	}
	
	public Map<String, Coord> getNearbyCoords(Coord coord) {
		return squares[coord.getX()][coord.getY()].getNearbyCoords();
	}
	
	public Square getSquare(Coord coord) {
		return squares[coord.getX()][coord.getY()];
	}
	
}
