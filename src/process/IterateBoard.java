package process;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import actions.FindWords;
import constants.WordProvider;
import model.Board;
import model.Square;
import model.Word;
import utils.WordValidation;

public class IterateBoard {
	
	private FindWords findWords;
	private Board board;
	private WordValidation validations;
	private Set<Character> letterSet;
	private Set<String> coupleLetterSet;
	
	public IterateBoard(Board board) {
		this.board = board;
		findWords = new FindWords(board);
		validations = WordValidation.getInstance();
		
		letterSet = new HashSet<>();
		letterSet.add('B');
		letterSet.add('D');
		letterSet.add('F');
		letterSet.add('G');
		letterSet.add('I');
		letterSet.add('M');
		letterSet.add('N');
		letterSet.add('P');
		letterSet.add('S');
		letterSet.add('T');
		letterSet.add('U');
		letterSet.add('Z');
		
		coupleLetterSet = WordProvider.coupleLettersProvider();
		
	}

	public void iterate() {

		Square[][] squares = board.getSquares();
		Map<String, Word> foundWords = new HashMap<>();
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				foundWords.putAll(findWords.find(squares[i][j]));
			}
		}
		
		System.out.println("foundWords total: " + foundWords.size());
		
		letterSet.forEach(k -> removeInvalidWords(foundWords, k));
		System.out.println("foundWords total (after cleaning of duplicate letters 1): " + foundWords.size());
		
		coupleLetterSet.forEach(k -> removeInvalidCoupleWords(foundWords, k));
		System.out.println("foundWords total (after cleaning of words 2): " + foundWords.size());
		
		Set<String> wordsSet = foundWords.keySet();
		
		List<String> eigth = wordsSet.stream().filter(k -> k.length() == 8).collect(Collectors.toList());
		System.out.println("Words with 8: " + eigth.size());
		
		List<String> seven = wordsSet.stream().filter(k -> k.length() == 7).collect(Collectors.toList());
		System.out.println("Words with 7: " + seven.size());
		
		List<String> six = wordsSet.stream().filter(k -> k.length() == 6).collect(Collectors.toList());
		System.out.println("Words with 6: " + six.size());
		
		List<String> five = wordsSet.stream().filter(k -> k.length() == 5).collect(Collectors.toList());
		System.out.println("Words with 5: " + five.size());
		
		List<String> four = wordsSet.stream().filter(k -> k.length() == 4).collect(Collectors.toList());
		System.out.println("Words with 4: " + four.size());
		
		List<String> three = wordsSet.stream().filter(k -> k.length() == 3).collect(Collectors.toList());
		System.out.println("Words with 3: " + three.size());
		
		List<String> two = wordsSet.stream().filter(k -> k.length() == 2).collect(Collectors.toList());
		System.out.println("Words with 2: " + two.size());
		
		System.out.println("\n\n-----");
		for (int i = 0; i < 200; i++) {
			System.out.println(six.get(i));
		}
		
		
//		System.out.println("Words: ");
//		foundWords.forEach((k, v) -> {
//			System.out.println(v.getWord());
//		});
		
	}
	
	private void removeInvalidWords(Map<String, Word> foundWords, char letter) {
		Set<String> toDelete = new HashSet<>();
		String repeated = "" + letter + letter;
		
		Set<String> setToDelete = foundWords.keySet().stream().filter(k -> k.contains(repeated)).filter(m -> !validations.validateDuplicate(m, letter)).collect(Collectors.toSet());
		toDelete.addAll(setToDelete);
		
		toDelete.forEach(k -> foundWords.remove(k));
	}
	
	private void removeInvalidCoupleWords(Map<String, Word> foundWords, String couple) {
		Set<String> toDelete = new HashSet<>();
		
		Set<String> setToDelete = foundWords.keySet().stream().filter(k -> k.contains(couple)).filter(m -> !validations.validateCoupleWord(m, couple)).collect(Collectors.toSet());
		toDelete.addAll(setToDelete);
		
		toDelete.forEach(k -> foundWords.remove(k));
	}

}
