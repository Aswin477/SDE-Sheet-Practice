import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    boolean isprime=true;
	    for(int i=2;i<n/2;i++)
	    {
	        if(n%i==0)
	        {
	            isprime=false;
	            break;
	            
	        }
	    }
	         if(isprime)
	        {
	         System.out.println(n + " is a prime number");
	        }
	       else
	       {
	        System.out.println(n + " is a composite number");
	        }
	    }
	
	
}
