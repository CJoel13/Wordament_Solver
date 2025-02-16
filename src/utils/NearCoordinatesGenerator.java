package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constants.Constants;
import model.Coord;

/**
 * For a given coordinate, generateCoordsLsit method retrieves a List 
 * with the surrounding coordinates.
 * 
 * 
 * @author joel1
 *
 */
public class NearCoordinatesGenerator {
  
  public static List<Coord> generateCoordsList(int x, int y) {
    List<Coord> nearby = new ArrayList<>();

    Coord minRange = getMinRange(x, y);
    Coord maxRange = getMaxRange(x, y);
    int minx = minRange.getX();
    int miny = minRange.getY();
    int maxx = maxRange.getX();
    int maxy = maxRange.getY();

    for (int i = minx; i <= maxx; i++) {
      for (int j = miny; j <= maxy; j++) {
        if (!(i == x && j == y)) {
          nearby.add(new Coord(i, j));
        }
      }
    }
    return nearby;
  }
	
	/**
	 * Retrieves the minimal nearby coordinate to set for a range.
	 * 
	 * Example: 
	 * * For Coord [1,1] "x"
	 * * Result: "N" [0,0]
	 * 
	 * [N] [ ] [ ]
	 * [ ] [x] [ ]
	 * [ ] [ ] [ ]
	 * 
	 * 
	 * @param x Position in x
	 * @param y Position in x
	 * @return The minimal nearby coordinate to set for a range.
	 */
    private static Coord getMinRange(int x, int y) {
      int minx = x == 0 ? 0 : x - 1;
      int miny = y == 0 ? 0 : y - 1;
      return new Coord(minx, miny);
    }
	
	/**
     * Retrieves the maximum nearby coordinate to set for a range.
     * 
     * Example: 
     * * For Coord [1,1] "x"
     * * Result: "N" [2,2]
     * 
     * [ ] [ ] [ ]
     * [ ] [x] [ ]
     * [ ] [ ] [N]
     * 
     * 
     * @param x Position in x
     * @param y Position in x
     * @return The maximum nearby coordinate to set for a range.
     */
    private static Coord getMaxRange(int x, int y) {
      int maxx = x == Constants.BOARD_SIZE - 1 ? Constants.BOARD_SIZE - 1 : x + 1;
      int maxy = y == Constants.BOARD_SIZE - 1 ? Constants.BOARD_SIZE - 1 : y + 1;
      return new Coord(maxx, maxy);
    }

}
