package tests;

import java.util.ArrayList;
import java.util.List;

import model.Coord;

public class ArrayListBehavior {

	public static void main(String[] args) {
		// Remove while iterating
		List<String> list1 = new ArrayList<>();
		list1.add("Hola");
		list1.add("Munddo");
		list1.add("Magia");
		list1.add("ddia");
		
		System.out.println("Lista completa: " + list1);
		
		// java.util.ConcurrentModificationException
//		for (String str : list1) {
//			if (str.contains("dd")) {
//				list1.remove(str);
//			}
//		}
		
		list1.removeIf(k -> k.contains("dd"));
		
		System.out.println("Despues de limpieza: " + list1);
		
	}
	
	private static void behavior2() {
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
		
		
		
		Coord d1 = new Coord(0, 1);
		Coord d2 = new Coord(0, 8);
		List<Coord> ds = new ArrayList<>();
		ds.add(d1);
		ds.add(d2);
		
		System.out.println("Removing:");
		cs.remove(ds.get(0));
		System.out.println("Finished:");
		System.out.println(cs.toString());
	}
	
	private static void behavior1() {
		List<String> list1 = new ArrayList<>();
		list1.add("Hola");
		list1.add("Mundo");
		
		System.out.println("list1: " + list1);
		
//		List<String> list2 = list1;	// Referencia a mismo objeto
		List<String> list2 = new ArrayList<>(list1);
		list2.remove(1);
		list1.add("Again");
		System.out.println("list2 after remove: " + list2);
		System.out.println("list1 after remove: " + list1);
		
		System.out.println("---");
		System.out.println(list1.get(list1.size() - 1));
	}
	
	
	
}
