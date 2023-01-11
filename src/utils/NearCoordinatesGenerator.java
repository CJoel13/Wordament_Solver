package utils;

import java.util.ArrayList;
import java.util.List;

import constants.Constants;
import model.Coord;

public class NearCoordinatesGenerator {
	
	public List<Coord> generateCoords(int x, int y) {
		List<Coord> nearby = new ArrayList<>();
		
		Coord minRange = getMinRange(x, y);
		Coord maxRange = getMaxRange(x, y);
		int minx = minRange.getX();
		int miny = minRange.getY();
		int maxx = maxRange.getX();
		int maxy = maxRange.getY();
		
		for (int i = minx; i <= maxx; i++) {
			for (int j = miny; j <= maxy; j++) {
				if (!(i == x && j == y))
					nearby.add(new Coord(i, j));
			}
		}
		return nearby;
	}
	
	private Coord getMinRange(int x, int y) {
		int minx = x == 0 ? 0 : x - 1;
		int miny = y == 0 ? 0 : y - 1;
		return new Coord(minx, miny);
	}
	
	private Coord getMaxRange(int x, int y) {
		int maxx = x == Constants.BOARD_SIZE - 1 ? Constants.BOARD_SIZE - 1 : x + 1;
		int maxy = y == Constants.BOARD_SIZE - 1 ? Constants.BOARD_SIZE - 1 : y + 1;
		return new Coord(maxx, maxy);
	}

}
