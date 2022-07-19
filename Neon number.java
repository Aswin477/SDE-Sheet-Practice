import java.util.*;
public class Main{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fin=num*num;
		int rem=0,sum=0;
		while(fin>0)
		{
		    rem=fin%10;
		    sum=sum+rem;
		    fin=fin/10;
		
		}
		if(sum==num)
		System.out.println("neon number");
		else{
		 System.out.println("not a neon number");
		}

	}

}

