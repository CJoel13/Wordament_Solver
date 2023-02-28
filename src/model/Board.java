package model;

import java.util.Map;

import actions.ReadInput;

public class Board {
	
	private Square[][] squares;
	
	public Board() {
		this.squares = new ReadInput().readInput();
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
