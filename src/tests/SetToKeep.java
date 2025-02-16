package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import constants.WordProvider;
import model.Coord;
import model.Word;

public class SetToKeep {
  
  public static void main(String[] args) {
    List<Coord> list = new ArrayList<>();
    list.add(new Coord(0, 0));
    list.add(new Coord(1, 1));
    list.add(new Coord(1, 2));
    list.add(new Coord(2, 2));
    list.add(new Coord(2, 1));
    
    
    Map<String, Word> map = new HashMap<>();
    
    map.put("ABC", new Word("ABC", list));
    map.put("UDRVAS", new Word("ABC", list));
    map.put("ABACORA", new Word("ABACORA", list));
    map.put("ANDINO", new Word("ANDINO", list));
    map.put("ABABOL", new Word("ABABOL", list));
    
    Set<String> result = map.keySet();
    
    
    Set<String> setToKeep = result.stream()
        .filter(k -> WordProvider.dictionary.contains(k))
        .collect(Collectors.toSet());
    
    System.out.println(setToKeep);
    
    /*
     * Create Map with resulting words
     */
    
    
    Map<String, Word> map2 = new HashMap<>();
    setToKeep.stream().forEach(k -> map2.put(k, map.get(k)));
    
    map2.keySet().stream().forEach(k -> {
      System.out.println(k);
      System.out.println(map2.get(k).getCoordinates());
      System.out.println("----");
      
      String value = " ";
      List<Coord> coordin = new ArrayList<Coord>(map2.get(k).getCoordinates());
      
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          int iFinal = i;
          int jFinal = j;
          
          Optional<Coord> iterCoord = coordin.stream()
              .filter(m -> m.getX() == iFinal && m.getY() == jFinal)
              .findFirst();
          
          if (iterCoord.isPresent()) {
            Coord currentCoord = iterCoord.get();
            value = coordin.indexOf(currentCoord) + "";
          } else {
            value = " ";
          }
          
          
          System.out.print("[" + value + "] ");
        }
        System.out.println();
      }
      System.out.println("----");
    });
    
    
  }

}
