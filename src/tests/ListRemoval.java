package tests;

import java.util.ArrayList;
import java.util.List;
import model.Coord;

public class ListRemoval {
  
  public static void main(String[] args) {
    List<Coord> currentWord = new ArrayList<>();
    currentWord.add(new Coord(0, 0));
    currentWord.add(new Coord(1, 1));
    currentWord.add(new Coord(2, 2));
    
    List<Coord> nearby = new ArrayList<>();
    nearby.add(new Coord(1, 1));
    nearby.add(new Coord(1, 2));
    nearby.add(new Coord(2, 1));
    
    /*
     * Result must include only [1, 2], [2, 1]
     */
    
    
    currentWord.forEach(k -> nearby.removeIf(n -> n.getCoordStr().equals(k.getCoordStr())));
    System.out.println(nearby);
    
  }

}
