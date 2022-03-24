
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int  a=s.nextInt();
	    int b=s.nextInt();
	    int lcm=0;
	   lcm=(a>b)?a:b;
	   
	    while(true)
	    {
	       if(lcm%a==0&&lcm%b==0){
	           break;
	       }
	       lcm++;
	    }
	    
	    System.out.println(lcm);
	   
	    
	}
}
