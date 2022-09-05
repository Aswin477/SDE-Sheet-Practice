import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   StringBuilder ans=new StringBuilder("aswinKUMar");
	   for(int i=0;i<ans.length();i++)
	   {
	      if(Character.isUpperCase(ans.charAt(i)))
	      {
	          ans.setCharAt(i,Character.toLowerCase(ans.charAt(i)));
	      }
	      else if(Character.isLowerCase(ans.charAt(i)))
	      {
	          ans.setCharAt(i,Character.toUpperCase(ans.charAt(i)));//capital 'C' at setChar  and small 'c' at charAt
	      }
	   }
	   System.out.println(ans);
	}
}

