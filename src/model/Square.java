package model;

import java.util.List;
import constants.Constants;
import utils.LetterValidations;
import utils.NearCoordinatesGenerator;

public class Square {
	
	private Coord coord;
	private List<Coord> nearbyCoordsList;
	
	private String letter;
	private boolean optionalLetter;
	private String secondLetter;
	private Integer letterSize;
	private Integer optionalLetterSize;
	
	public Square(String letter, int x, int y) {
		this.coord = new Coord(x, y);
		setLetter(letter);
		setNearbyCoordsList(x, y);
	}
	
	private void setNearbyCoordsList(int x, int y) {
	  nearbyCoordsList  = NearCoordinatesGenerator.generateCoordsList(x, y);
	}
	
	private void setLetter(String letter) {
		if (letter == null || letter.isEmpty())
			throw new IllegalArgumentException("Invalid letter");
		
		letter = letter.toUpperCase();
		
		if (!letter.contains(Constants.SEPARATOR_CHARACTER)) {
			if (LetterValidations.validateRealLetter(letter)) {
				this.letter = letter;
				this.letterSize = letter.length();
			}
		} else {
			String[] optionals = letter.split(Constants.SEPARATOR_CHARACTER);
			if (optionals.length != 2 || optionals[0].isEmpty())
				throw new IllegalArgumentException("Optionals are invalid");
			LetterValidations.validateRealLetter(optionals[0]);
			LetterValidations.validateRealLetter(optionals[1]);
			
			this.letter = optionals[0];
			this.secondLetter = optionals[1];
			
			this.letterSize = optionals[0].length();
			this.optionalLetterSize = optionals[1].length();
					
			this.optionalLetter = true;
			
		}
	}

	public Coord getCoord() {
		return coord;
	}
	
	public List<Coord> getNearbyCoordsList() {
	  return nearbyCoordsList;
	}

	public String getLetter() {
		return letter;
	}

	public boolean isOptionalLetter() {
		return optionalLetter;
	}

	public String getSecondLetter() {
		return secondLetter;
	}

	public Integer getLetterSize() {
		return letterSize;
	}

	public Integer getOptionalLetterSize() {
		return optionalLetterSize;
	}

	@Override
	public String toString() {
		
		String value = "[" + this.letter + (this.isOptionalLetter() ? ("/" + this.secondLetter) : "") + "]";
		return value;
	}
	
}
