package process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import actions.FindWords;
import constants.Constants;
import constants.WordProvider;
import model.Board;
import model.Coord;
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
		letterSet = WordProvider.validDuplicateLetterSet();
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
		
		/*
		 * Validation vs dictionary
		 */
		
        Set<String> setToKeep = foundWords.keySet().stream()
            .filter(k -> WordProvider.dictionary.contains(k))
            .collect(Collectors.toSet());
        
        System.out.println("setToKeep total (after cleaning of words 3): " + setToKeep.size());
        
        System.out.println("---");
        
        Map<String, Word> map2 = new HashMap<>();
        setToKeep.stream().forEach(k -> map2.put(k, foundWords.get(k)));

        /*
         * Print all results unsorted
         */
//        map2.keySet().stream().forEach(k -> {
//          System.out.println(k);
//          System.out.println("---");
//          /*
//           * Cloned to a new ArrayList, since with each iteration will be removed the first element.
//           */
//          List<Coord> coordin = new ArrayList<Coord>(map2.get(k).getCoordinates());
//          int index = 1;
//          String value = " ";
//          
//          for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//              
//              if (!coordin.isEmpty() && coordin.get(0).getX() == i && coordin.get(0).getY() == j) {
//                value = index + "";
//                index++;
//                coordin.remove(0);
//              } else {
//                value = " ";
//              }
//              System.out.print("[" + value + "] ");
//            }
//            System.out.println();
//          }
//          System.out.println("----");
//        });
        
        
        
        
        
		/*
		 * Print words by size (8 : 2)
		 */
		Set<String> wordsSet = map2.keySet();
		
//		Set<String> eigth = wordsSet.stream().filter(k -> k.length() == 8).collect(Collectors.toSet());
//        System.out.println("Words with 8: " + eigth.size());
//        eigth.stream().forEach(k -> printCoordinateOrder(k, map2));
//        System.out.println("----");
        
        for (int size = 8; size > 1; size--) {
          int sizeFinal = size;
          Set<String> wordsBySize = wordsSet.stream().filter(k -> k.length() == sizeFinal).collect(Collectors.toSet());
          System.out.println("Words with " + size + " letters: " + wordsBySize.size());
          wordsBySize.stream().forEach(k -> printCoordinateOrder(k, map2));
          System.out.println("----");
        }
		
		
//		List<String> eigth = wordsSet.stream().filter(k -> k.length() == 8).collect(Collectors.toList());
//		System.out.println("Words with 8: " + eigth.size());
//		eigth.stream().forEach(k -> System.out.println(k));
//		System.out.println("----");
		
//		List<String> seven = wordsSet.stream().filter(k -> k.length() == 7).collect(Collectors.toList());
//		System.out.println("Words with 7: " + seven.size());
//		
//		List<String> six = wordsSet.stream().filter(k -> k.length() == 6).collect(Collectors.toList());
//		System.out.println("Words with 6: " + six.size());
//		
//		List<String> five = wordsSet.stream().filter(k -> k.length() == 5).collect(Collectors.toList());
//		System.out.println("Words with 5: " + five.size());
//		
//		List<String> four = wordsSet.stream().filter(k -> k.length() == 4).collect(Collectors.toList());
//		System.out.println("Words with 4: " + four.size());
//		
//		List<String> three = wordsSet.stream().filter(k -> k.length() == 3).collect(Collectors.toList());
//		System.out.println("Words with 3: " + three.size());
//		
//		List<String> two = wordsSet.stream().filter(k -> k.length() == 2).collect(Collectors.toList());
//		System.out.println("Words with 2: " + two.size());
		
		
		
//		System.out.println("\n\n-----");
//		for (int i = 0; i < 187; i++) {
//			System.out.println(six.get(i));
//		}
		
		
//		System.out.println("Words: ");
//		foundWords.forEach((k, v) -> {
//			System.out.println(v.getWord());
//		});
		
	}
	
	private void printCoordinateOrder(String k, Map<String, Word> map2) {
	  System.out.println(k);
      System.out.println("---");
      /*
       * Cloned to a new ArrayList, since with each iteration will be removed the first element.
       */
      List<Coord> coordin = new ArrayList<Coord>(map2.get(k).getCoordinates());
      String value = " ";
      
      for (int i = 0; i < Constants.BOARD_SIZE; i++) {
        for (int j = 0; j < Constants.BOARD_SIZE; j++) {
          int iFinal = i;
          int jFinal = j;
          
          Optional<Coord> iterCoord = coordin.stream()
              .filter(m -> m.getX() == iFinal && m.getY() == jFinal)
              .findFirst();
          
          if (iterCoord.isPresent()) {
            Coord currentCoord = iterCoord.get();
            value = coordin.indexOf(currentCoord) + 1 + "";
          } else {
            value = " ";
          }
          
          
          System.out.print("[" + value + "] ");
        }
        System.out.println();
      }
      System.out.println("----");
	}
	
	private void removeInvalidWords(Map<String, Word> foundWords, char letter) {
		Set<String> toDelete = new HashSet<>();
		String repeated = "" + letter + letter;
		
		Set<String> setToDelete = foundWords.keySet().stream()
		    .filter(k -> k.contains(repeated))
		    .filter(m -> !validations.validateDuplicate(m, letter))
		    .collect(Collectors.toSet());
		toDelete.addAll(setToDelete);
		
		toDelete.forEach(k -> foundWords.remove(k));
	}
	
	private void removeInvalidCoupleWords(Map<String, Word> foundWords, String couple) {
		Set<String> toDelete = new HashSet<>();
		
		Set<String> setToDelete = foundWords.keySet().stream()
		    .filter(k -> k.contains(couple))
		    .filter(m -> !validations.validateCoupleWord(m, couple))
		    .collect(Collectors.toSet());
		toDelete.addAll(setToDelete);
		
		toDelete.forEach(k -> foundWords.remove(k));
	}
	
	private void printCoordinates(List<Coord> coord) {
	  
	}

}
