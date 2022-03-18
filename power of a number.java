import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int ans=1;
        for(int i=0;i<b;i++)
        {
            ans=ans*a;
            
        }
        System.out.println(ans);
    }
}