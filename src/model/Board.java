package model;

import java.util.List;

import actions.ReadInput;

public class Board {
	
	private Square[][] squares;
	
	public Board() {
		this.squares = new ReadInput().readInput();
	}

	public Square[][] getSquares() {
		return squares;
	}
	
	public List<Coord> getNearbyCoords(Coord coord) {
		return squares[coord.getX()][coord.getY()].getNearbyCoords();
	}
	
	public Square getSquare(Coord coord) {
		return squares[coord.getX()][coord.getY()];
	}
	
}
