package demo1;

public class Practice2 {
public static int Binarysearch(int arr[],int element)
{
	int s=0;
	int end=arr.length-1;
	while(s<=end){
		int mid=(s+end)/2;
	if(arr[mid]>element)
	{
		end=mid-1;
	}
	else if(arr[mid]<element)
	{
		s=mid+1;
	}
	else
	{
		return mid;
	}
	
	}
	return -1;
	
}
	public static void main(String[] args) {
		 
		int arr[]= {1,2,4,7,8,10};
		int value=Binarysearch(arr,7);
		System.out.println(value);
      
      
       
       
		
	}
	
}

