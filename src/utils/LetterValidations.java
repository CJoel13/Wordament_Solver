package utils;

public class LetterValidations {
	
	/**
	 * Validates if characters are real letters
	 * 
	 * @param letter User's input letter 
	 * @return the result of validation
	 */
	public boolean validateRealLetter(String letter) {
		if (letter.length() > 2)
			throw new IllegalArgumentException("Invalid size of letter");
		
		validateAscii(letter.charAt(0));
		
		if (letter.length() == 2)
			validateAscii(letter.charAt(1));
		
		return true;
	}
	
	/**
	 * Validate if character is actually a letter.
	 * @param singleLetter
	 * @return
	 */
	private boolean validateAscii(char singleLetter) {
		if (singleLetter >= 65 && singleLetter <= 90) {
			return true;
		} else {
			throw new IllegalArgumentException("Character is not a letter");
		}
	}

}
