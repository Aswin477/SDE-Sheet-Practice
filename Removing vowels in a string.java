package demo1;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="foelitupda";
       char c1[]=s.toCharArray();
       int result;
       int nonvowels;
       for(int i=0;i<c1.length;i++)
       {
    	   if(c1[i]=='a' || c1[i]=='e' ||c1[i]=='i'|| c1[i]=='o'||c1[i]=='u')
    	   {
    		   
    		   result=c1[i];
    		   
    	   }
    	   else
    	   {
    		   nonvowels=c1[i];
    		   System.out.println(c1[i]);
    	   }
       }
       
	}

}

