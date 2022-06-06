import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner s=new  Scanner(System.in);
	  System.out.println("Enter the text");
	  String sn=s.next();
	  int num=s.nextInt();
	  System.out.println(sn.repeat(num));
	  
	}
}

