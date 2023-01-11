package tests;

import java.util.Arrays;

public class SeparateOptionalLetters {
	
	public static void main(String[] args) {
		String str1 = "I";
		String str2 = "I/U";
		String str3 = "I/CH";
		String str4 = "LL/CH";
		String str5 = "LL/";
		String str6 = "/LL";
		String str7 = "/";
		
		System.out.println("INICIO:");
		print(str1.split("/"));
		System.out.println("\n\nINICIO:");
		print(str2.split("/"));
		System.out.println("\n\nINICIO:");
		print(str3.split("/"));
		System.out.println("\n\nINICIO:");
		print(str4.split("/"));
		System.out.println("\n\nINICIO:");
		print(str5.split("/"));
		System.out.println("\n\nINICIO:");
		print(str6.split("/"));
		System.out.println("\n\nINICIO:");
		print(str7.split("/"));
		
	}
	
	private static void print(String[] newStr) {
		System.out.println("---");
		System.out.println("Size: " + newStr.length);
		for (String s : newStr) {
			System.out.println("value: |||" + s + "|||");
		}
	}

}
