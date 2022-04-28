package demo1;

import java.util.Arrays;
import java.util.Comparator;

public class Strings {

	public static void main(String[] args) {
		String font="i am the laziest person";
	
		String large=Arrays.stream(font.split(" "))
                        .max(Comparator.comparingInt(String::length)).orElse(null).toString();
		System.out.println("largest word " +large +" "+ large.length());

	}

}

