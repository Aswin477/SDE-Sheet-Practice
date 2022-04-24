package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Hell {

	public static void main(String[] args) {
		ArrayList <String> names=new ArrayList <String> (Arrays.asList("python","php","python","java","php","css","python"));
		LinkedHashSet <String> rmduplicates=new LinkedHashSet <String> (names);
		ArrayList <String> sum=new ArrayList <String> (rmduplicates);
		System.out.println(sum);
	}

}

