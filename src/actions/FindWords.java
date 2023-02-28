package actions;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import constants.Constants;
import model.Board;
import model.Coord;
import model.Square;
import model.Word;
import utils.WordValidation;

public class FindWords {
	
	private Map<String, Word> words;
	private Board board;
	private WordValidation wordValidation;
	
	public FindWords(Board board) {
		words = new HashMap<>();
		this.board = board;
		this.wordValidation = WordValidation.getInstance();
	}
	
	/**
	 * Search possible words starting in current square
	 * @param currentSquare
	 * @param board
	 * @return
	 */
	public Map<String, Word> find(Square currentSquare) {
		
		StringBuilder buildWord = new StringBuilder();
		buildWord.append(currentSquare.getLetter());
		
		Word word = new Word();
		word.setCoordinate(currentSquare.getCoord());
		word.setWord(buildWord.toString());
		
		findRecursive(word, buildWord);
		
		if (currentSquare.isOptionalLetter()) {
			buildWord = new StringBuilder();
			buildWord.append(currentSquare.getSecondLetter());
			
			word = new Word();
			word.setCoordinate(currentSquare.getCoord());
			word.setWord(buildWord.toString());
			
			findRecursive(word, buildWord);
		}
		
		return words;
	}
	
	/**
	 * Recursive method to find and store words from initial square.
	 * @param currentWord Initial Word or current word (Contains at least first coordinate)
	 * @param buildWord (Contains at least first letter)
	 */
	private boolean findRecursive(Word currentWord, StringBuilder buildWord) {
		
		if (buildWord.length() >= 2 && !wordValidation.validateExistence(currentWord)) {
			return false;
		}
		
		
		
		if (buildWord.length() >= Constants.WORD_MIN_SIZE) {
			if (!wordValidation.validateThree(currentWord))
				return false;
			words.put(buildWord.toString(), new Word(buildWord.toString(), currentWord.getCoordinates()));
		}
			
		
		if (buildWord.length() >= Constants.WORD_SIZE)
			return true;
		
		List<Coord> nearbyCoords = getAvailableNearbyCoords(currentWord);
		
		for (Coord coord : nearbyCoords) {
			Square nextSquare = board.getSquare(coord);
			
			StringBuilder newBuildWord = new StringBuilder(buildWord);
			newBuildWord.append(nextSquare.getLetter());
			
			Word newWord = new Word();
			newWord.setCoordinates(currentWord.getCoordinates());
			newWord.setCoordinate(nextSquare.getCoord());
			newWord.setWord(newBuildWord.toString());
			
			findRecursive(newWord, newBuildWord);
			
			if (nextSquare.isOptionalLetter()) {
				newBuildWord = new StringBuilder(buildWord);
				newBuildWord.append(nextSquare.getSecondLetter());
				
				newWord = new Word();
				newWord.setCoordinates(currentWord.getCoordinates());
				newWord.setCoordinate(nextSquare.getCoord());
				newWord.setWord(newBuildWord.toString());
				
				findRecursive(newWord, newBuildWord);
			}
		}
		
		return true;
	}
	
	private List<Coord> getAvailableNearbyCoords(Word currentWord) {
		Coord coord = currentWord.getLastCoordinate();
		Map<String, Coord> nearbyCoords = new HashMap<>(board.getNearbyCoords(coord));
		
		currentWord.getCoordinates().forEach(k -> nearbyCoords.remove(k.getCoordStr()));
		
		Collection<Coord> collection = nearbyCoords.values();
		return collection.stream().collect(Collectors.toList());
//		return Arrays.asList(nearbyCoords.values());
//		return (List<Coord>) nearbyCoords.values();
	}

}
