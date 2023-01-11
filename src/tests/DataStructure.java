package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Coord;

public class DataStructure {
	
	public static void main(String[] args) {
		Map<String, Coord> map = new HashMap<>();
		
		Coord c1 = new Coord(0, 1);
		Coord c2 = new Coord(0, 2);
		Coord c3 = new Coord(0, 3);
		Coord c4 = new Coord(0, 4);
		Coord c5 = new Coord(0, 5);
		Coord c6 = new Coord(0, 6);
		Coord c7 = new Coord(0, 7);
		Coord c8 = new Coord(0, 8);
		List<Coord> cs = new ArrayList<>();
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		cs.add(c5);
		cs.add(c6);
		cs.add(c7);
		cs.add(c8);
		
		System.out.println("Coords cs: " + cs);
		
		Coord d1 = new Coord(0, 1);
		Coord d2 = new Coord(0, 8);
		List<Coord> ds = new ArrayList<>();
		ds.add(d1);
		ds.add(d2);
		
		System.out.println("Coords ds: " + ds);
		
		cs.forEach(k -> {
			map.put(k.getCoordStr(), k);
		});
		
		System.out.println("map: " + map);
		
		ds.forEach(k -> {
			map.remove(k.getCoordStr());
		});
		
		System.out.println("map: " + map);
		
		ArrayList list = (ArrayList) map.values();
		
	}
	
	private static void useMaps() {
		Map<String, String> map = new HashMap<>();
		map.put("SILLA", "value1");
		map.put("MESA", "value2");
		map.put("ARM", "value3");
		
		System.out.println("map: " + map);
		map.put("SILLA", "value4");
		System.out.println("map: " + map);
	}

}
