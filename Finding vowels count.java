import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	   System.out.println("Enter the text");
	    String str=s.next();
	    int count=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	   char ch=str.charAt(i);
	    
	    switch(ch)
	    {
	        case 'a':
	            count++;
	            break;
	       case 'e':
	           count++;
	           break;
	       case 'i':
	           count++;
	           break;
	       case 'o':
	           count++;
	           break;
	       case 'u':
	           count++;
	           break;
	    }
	    
	    }
		System.out.println("count of vowels is"+count);
	}
}

