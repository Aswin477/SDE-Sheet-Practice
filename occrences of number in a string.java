package learn;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class Ll {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		int arr[]= {1,2,3,4,1,2,1,3,4,5,3};
		for(int i=0;i<arr.length;i++) {
			int c=map.getOrDefault(arr[i],0);//getordefault is used to find the count if there is no element it saves as 0 because it is mentioned
			map.put(arr[i],c+1);//put replaces the element (map doesn't allow duplictae)if it finds two (1,1),it replaces 1 with another1
		}
       for(int i:map.keySet())//keyset used to find and print key values {
    	   System.out.println(i+"---"+map.get(i));//it used to get output
       }
	}

}

