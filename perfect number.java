import java.util.Scanner;
public class Main
{
    public static boolean isperfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
            if(num==sum)
             return true;
        }
       
        return false;
    }
	
	public static void main(String[] args) {
	
		int num=6;
		boolean per=isperfect(num);
		if(per)
		{
		    System.out.println("its a perfect number");
		}
		else{
		    System.out.println("its not a perfect number");
		}
		
}
}
