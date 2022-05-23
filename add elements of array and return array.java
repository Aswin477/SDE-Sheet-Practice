package demo1;

public class Practice2 {
	 public static void main(String[] args) {
	int arr[]= {1,7,4,5,6,8};
	int count=0;
	for(int i=0;i<arr.length;i++) {
		count+=arr[i];
	}
		System.out.println(count);
	
	 if(count%2==0)
	 {
		 System.out.println(count);
	 }
	 else {
		 for(int i:arr)
		 {
			 System.out.println(i);
		 }
	 }
	
	 }
 }


