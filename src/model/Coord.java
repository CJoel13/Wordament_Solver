package model;

/**
 * Coordinate structure to identify position of a {@link Square} within a {@link Board}.
 * @author joel1
 *
 */
public class Coord {
	
	private int x;
	private int y;
	/**
	 * TODO: Define what is this & why is necessary?
	 */
	private String coordStr;
	
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
		this.coordStr = x + "" + y;
	}
	
	public String getCoordStr() {
		return coordStr;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	

}
