public class Main
{
	public static void main(String[] args) {
		int i,j;
		int n=4;
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(j==0||i==2||j==3)
		        {
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}
