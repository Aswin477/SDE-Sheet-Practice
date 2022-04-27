package demo1;

public class Strings {

	public static void main(String[] args) {
		String val="fjoefajnOJDFLAslaslflfakf";
		int length= val.length();
		char ch[]=val.toCharArray();
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					break;
				}
				
			}
		}
		

	}

}

