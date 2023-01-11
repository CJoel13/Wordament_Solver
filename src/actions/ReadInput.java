package actions;

import java.util.List;
import java.util.Scanner;

import constants.Constants;
import model.Coord;
import model.Square;

public class ReadInput {
	
	private Scanner scanner;
	private Square[][] squares;
	private final String[] letra1 = {"A/Z", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"};
	
	public ReadInput() {
		scanner = new Scanner(System.in);
		squares = new Square[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
	}
	
	public Square[][] readInput() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				System.out.print("Enter letter: ");
				String letter = scanner.next();
				squares[i][j] = new Square(letter, i, j);
			}
		}
		printInput();
		return squares;
	}
	
	public void readInputMock() {
		int w = 0;
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				String letter = letra1[w];
				w++;
				squares[i][j] = new Square(letter, i, j);
			}
		}
		printInput();
		System.out.println();
		printNearCoords();
	}
	
	private void printInput() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
//				System.out.print("[" + squares[i][j].getLetter() + "] ");
				System.out.print("[" + squares[i][j].getLetter() + (squares[i][j].isOptionalLetter() ? "/" + squares[i][j].getSecondLetter() : "") + "] ");
			}
			System.out.println();
		}
	}
	
	private void printNearCoords() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				System.out.println("Letter: " + "[" + squares[i][j].getLetter() + "] ");
				System.out.print("Coordinate: ");
				printCoord(squares[i][j].getCoord());
				System.out.println("Near coords: ");
				printCoords(squares[i][j].getNearbyCoords());
			}
			System.out.println();
		}
	}
	
	private void printCoord(Coord coord) {
		System.out.println("(" + coord.getX() + ", " + coord.getY() + ")");
	}
	
	private void printCoords(List<Coord> coords) {
		coords.forEach(k -> printCoord(k));
	}
	
	public static void main(String[] args) {
		ReadInput o = new ReadInput();
		o.readInputMock();
	}

}
