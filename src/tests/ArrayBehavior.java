package tests;

import java.util.ArrayList;
import java.util.List;

import model.Coord;

public class ArrayBehavior {
	
	public static void main(String[] args) {
		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		System.out.println("array.length: " + array.length);
		System.out.println("array[0].length: " + array[0].length);
		System.out.println("---");
		
		array[2][3] = 100;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("[" + array[i][j] + "] ");
			}
			System.out.println();
		}
	}
	
	public List<Coord> getPosibleCoords(Coord current, List<Coord> used) {
		List<Coord> posibles = new ArrayList<>();
		
		/**
		 * Posibles:
		 * 
		 * Todas*		
		 */
		
		
		
		return null;
	}

}
