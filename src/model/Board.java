package model;

import java.util.List;

public class Board {
	
	private Square[][] squares;
	
	public Board(Square[][] squares) {
	  this.squares = squares;
	}

	public Square[][] getSquares() {
		return squares;
	}
	
	public List<Coord> getNearbyCoordsList(Coord coord) {
	  return squares[coord.getX()][coord.getY()].getNearbyCoordsList();
	}
	
	public Square getSquare(Coord coord) {
		return squares[coord.getX()][coord.getY()];
	}
	
}
