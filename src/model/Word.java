package model;

import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private String word;
	private List<Coord> coordinates;
	private Integer wordSize;
	
	public Word() {
		coordinates = new ArrayList<>();
		wordSize = 0;
	}
	
	public Word(String word, List<Coord> coordinates) {
		this.word = word;
		this.coordinates = new ArrayList<>(coordinates);
	}
	
	public String getWord() {
		return word;
	}
	public List<Coord> getCoordinates() {
		return coordinates;
	}
	public Coord getLastCoordinate() {
		if (coordinates != null || !coordinates.isEmpty()) {
			return coordinates.get(coordinates.size() - 1);
		} else {
			throw new InternalError("Coordinates are empty or null");
		}
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	public void setCoordinates(List<Coord> coordinates) {
		this.coordinates = coordinates;
	}
	
	public void setCoordinate(Coord coord) {
		coordinates.add(coord);
	}
	
	

}
