package actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constants.Constants;
import model.Board;
import model.Coord;
import model.Square;
import model.Word;

public class FindWords {
	
	private Map<String, Word> words;
	private Board board;
	
	public FindWords(Board board) {
		words = new HashMap<>();
		this.board = board;
	}
	
	/**
	 * Search posible words starting in current square
	 * @param currentSquare
	 * @param board
	 * @return
	 */
	public Map<String, Word> find(Square currentSquare) {
		
		Word word = new Word();
		StringBuilder buildWord = new StringBuilder();
		
		/**
		 * Se agrega primer coordenada y letra
		 */
		word.setCoordinate(currentSquare.getCoord());
		buildWord.append(currentSquare.getLetter());
		
		/**
		 * Iterar primer letra
		 */
		
		/**
		 * Si primer letra tiene dos opciones
		 */
		if (currentSquare.isOptionalLetter()) {
			word = new Word();
			word.setCoordinate(currentSquare.getCoord());
			buildWord = new StringBuilder();
			buildWord.append(currentSquare.getLetter());
			/**
			 * Iterar segunda letra
			 */
		}
		
		return words;
	}
	
	/**
	 * Recursive method to find and store words from initial square.
	 * @param currentWord Initial Word or current word (Contains at least first coordinate)
	 * @param buildWord (Contains at least first letter)
	 */
	private boolean findRecursive(Word currentWord, StringBuilder buildWord) {
		
		if (buildWord.length() >= Constants.WORD_MIN_SIZE)
			words.put(buildWord.toString(), new Word(buildWord.toString(), currentWord.getCoordinates()));
		
		if (buildWord.length() >= Constants.WORD_SIZE)
			return true;
		
		/**
		 * Get nearby coords
		 */
		List<Coord> nearbyCoords = getAvailableNearbyCoords(currentWord);
		for (Coord coord : nearbyCoords) {
			Square nextSquare = board.getSquare(coord);
			
			Word newWord = new Word(buildWord.toString(), currentWord.getCoordinates());
			StringBuilder newBuildWord = new StringBuilder(newWord.getWord());
			
			newWord.setCoordinate(nextSquare.getCoord());
			newBuildWord.append(nextSquare.getLetter());
			
			findRecursive(newWord, newBuildWord);
		}
		
		return true;
	}
	
	private List<Coord> getAvailableNearbyCoords(Word currentWord) {
		Coord coord = currentWord.getLastCoordinate();
		List<Coord> nearbyCoords = board.getNearbyCoords(coord);
		Map<String, Coord> map = new HashMap<>();
		
		/**
		 * Clean nearby coords
		 */
		nearbyCoords.forEach(k -> {
			
		});
		
		
		List<Coord> availableNearbyCoords = null;
		
		
		
		return nearbyCoords;
	}

}
