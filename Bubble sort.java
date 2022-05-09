package demo1;

public class Practice2 {
public static void bubblesort(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
public static void printarray(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		 
		int arr[]= {7,1,4,3,9,2,8};
		bubblesort(arr);
		printarray(arr);
		
		
	}
	
}

