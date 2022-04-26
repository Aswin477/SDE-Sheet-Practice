package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Binary {
	

	public static void main(String[] args) {

		ArrayList <Integer> num=new  ArrayList <Integer> (Arrays.asList(2,4,3,8,5,1,7));
		Collections.sort(num);
		System.out.println(num);
		int newnum=Collections.binarySearch(num,8);
		System.out.println(newnum);
		
		
		

	}

}

