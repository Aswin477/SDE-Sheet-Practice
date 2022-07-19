import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int odd=0,even=0;
		for(String i:str.split(""))//to get element like this  1234
		{
		    int t=Integer.parseInt(i);//to convert the string into integer
		    if(t%2==0)
		    {
		        even++;
		    }
		    else{
		        odd++;
		    }
		    
		}
		}
		}
		//Another logic by splitting the numbers
		System.out.println("ODD"+" "+odd+"\nEVEN"+" "+even);
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int odd=0,eve=0;
		int sum=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			if(sum%2==0)
			{
				eve++;
			}
			else
			{
				odd++;
			}
			
					}
		System.out.println("odd "+odd+" "+"even "+eve+" ");

		

	


