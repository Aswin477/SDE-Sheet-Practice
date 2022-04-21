package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Hell {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,5,6,7,2,3,3,6,5,7,5,7));
	    LinkedHashSet<Integer> newnum=new LinkedHashSet<Integer>(numbers);
	    ArrayList<Integer> numberswithoutduplicate=new ArrayList<Integer>(newnum);
		System.out.println(numberswithoutduplicate);
	}

}

