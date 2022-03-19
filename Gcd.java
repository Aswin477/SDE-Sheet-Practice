import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int var1=s.nextInt();
	   int var2=s.nextInt();
	   
	   if(var1%var2!=0)
	   {
	       int rem=var1%var2;
	       var1=var2;
	       var2=rem;
	   }
	   System.out.println(var2);
	}
}
