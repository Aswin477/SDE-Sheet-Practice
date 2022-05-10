package demo1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice2 {

	public static void main(String[] args) {
		 
		Set <Integer> num=new HashSet<>();
		num.add(100);
		num.add(500);
		num.add(300);
		num.add(400);
		System.out.println(num);
		//union
		Set <Integer> first=new HashSet<>(Arrays.asList(1,3,4,5,6,8,9,10));
		Set <Integer> second=new HashSet<>(Arrays.asList(1,2,3,5,6,7,9));
		//difference
	       first.removeAll(second);
	       System.out.println(first);
			//union
		first.addAll(second);
		System.out.println(first);
		//intersection
       first.retainAll(second);
       System.out.println(first);
      
       
       
		
	}
	
}

