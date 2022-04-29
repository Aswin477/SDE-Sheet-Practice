package demo1;

import java.util.HashMap;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,2,7,5,5,1,4};
		HashMap <Integer,Integer> count=new HashMap<Integer,Integer> ();
		for(int i=0;i<arr.length;i++)
		{
			if(count.containsKey(arr[i]))
					{
				        count.put(arr[i],count.get(arr[i])+1);
					}
			else {
				count.put(arr[i],1);
			}
			
		}
		count.forEach((k,v)->System.out.println("number ="+k+"count= "+v));
				
	}

}

