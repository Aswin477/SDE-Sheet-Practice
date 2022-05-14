import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int d=s.nextInt();
	    int e=s.nextInt();
	    int f=s.nextInt();
		System.out.println("the  greatest number is "+Math.max(d,Math.max(e,f)));
	}
}
