package demopack11;
import java.util.Scanner;
public class Time 
{
	public static void main(String[] args)
	{
		int flag = 0;
		do
		{
			try
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Entetr hours");
				int h = scan.nextInt();
				System.out.println("Entetr min");
				int m = scan.nextInt();
				System.out.println("Entetr sec");
				int s = scan.nextInt();
				Clock c1 = new Clock(h,m,s);
				System.out.println(c1);
				flag =1;				
			}
			catch(Exception e)
			{
				System.out.println("enter valid value...");
				flag=1;
			}
		}
		while(flag==1);
	}

}
