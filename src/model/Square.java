package model;

import java.util.ArrayList;
import java.util.List;

import constants.Constants;
import utils.LetterValidations;
import utils.NearCoordinatesGenerator;

public class Square {
	
	private Coord coord;
	private List<Coord> nearbyCoords;
	private List<Coord> availableNearbyCoords;
	
	private String letter;
	private boolean optionalLetter;
	private String secondLetter;
	private Integer letterSize;
	private Integer optionalLetterSize;
	
	private LetterValidations letterValidations;
	private NearCoordinatesGenerator coordGenerator;
	
	public Square(String letter, int x, int y) {
		this.letterValidations = new LetterValidations();
		this.coordGenerator = new NearCoordinatesGenerator();
		this.coord = new Coord(x, y);
		
		setLetter(letter);
		setNearbyCoords(x, y);
	}
	
	private void setNearbyCoords(int x, int y) {
		nearbyCoords = coordGenerator.generateCoords(x, y);
		availableNearbyCoords = new ArrayList<>(nearbyCoords);
	}
	
	private void setLetter(String letter) {
		if (letter == null || letter.isEmpty())
			throw new IllegalArgumentException("Invalid letter");
		
		letter = letter.toUpperCase();
		
		if (!letter.contains(Constants.SEPARATOR_CHARACTER)) {
			if (letterValidations.validateRealLetter(letter)) {
				this.letter = letter;
				this.letterSize = letter.length();
			}
		} else {
			String[] optionals = letter.split(Constants.SEPARATOR_CHARACTER);
			if (optionals.length != 2 || optionals[0].isEmpty())
				throw new IllegalArgumentException("Optionals are invalid");
			
			letterValidations.validateRealLetter(optionals[0]);
			letterValidations.validateRealLetter(optionals[1]);
			
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

	public List<Coord> getNearbyCoords() {
		return nearbyCoords;
	}

	public List<Coord> getAvailableNearbyCoords() {
		return availableNearbyCoords;
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
	
	
	

}
