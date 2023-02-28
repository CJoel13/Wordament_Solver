package utils;

import java.util.List;
import java.util.Map;

import constants.WordProvider;
import model.Word;

public class WordValidation {

	private Map<Character, List<Character>> invalidLetters;
	private Map<Character, List<String>> validDoubleWords;
	private Map<String, List<String>> validWords;
	
	private static WordValidation reference;

	private WordValidation() {
		invalidLetters = WordProvider.invalidLettersProvider();
		validDoubleWords = WordProvider.validDoubleWordProvider();
		validWords = WordProvider.validRareWordProvider();
	}
	
	public static WordValidation getInstance() {
		if (reference != null) {
			return reference;
		}
		return new WordValidation();
	}
	
	public boolean validateCoupleWord(String word, String pair) {
		List<String> wordsList = validWords.get(pair);
		
		for (String valid : wordsList) {
			if (word.equals(valid))
				return true;
		}
		
		return false;
	}

	public boolean validateExistence(Word currentWord) {
		String word = currentWord.getWord();

		if (!validateSuccessiveLetters(word))
			return false;

		return true;
	}

	public boolean validateDuplicate(String word, char letter) {
		List<String> wordsList = validDoubleWords.get(letter);
		
		for (String valid : wordsList) {
			if (word.equals(valid))
				return true;
		}

		return false;
	}

	private boolean validateSuccessiveLetters(String word) {
		char currentLetter = word.charAt(word.length() - 1);
		char previousLetter = word.charAt(word.length() - 2);

		List<Character> invalids = invalidLetters.get(currentLetter);

		if (invalids == null || invalids.isEmpty())
			return true;

		for (Character invalid : invalids) {
			if (previousLetter == invalid)
				return false;
		}

		return true;
	}

	public boolean validateThree(Word currentWord) {
		String word = currentWord.getWord();
		int length = word.length();

		if (word.charAt(length - 1) == word.charAt(length - 2) && word.charAt(length - 1) == word.charAt(length - 3))
			return false;

		return true;
	}

}
