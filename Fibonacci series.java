import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        int t1=0,t2=1;
        int  nextterm,number;
        Scanner s=new Scanner(System.in);
         number=s.nextInt();
        for(int i=0;i<number;i++)
        {
           System.out.printf("%d",t1);
           nextterm=t1+t2;
           t1=t2; 
           t2=nextterm;
            
        }
       
    }
}
