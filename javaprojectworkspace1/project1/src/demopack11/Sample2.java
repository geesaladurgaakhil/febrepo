package demopack11;
import java.util.Scanner;
public class Sample2 
{
	public static void main(String[] args)
	{
		System.out.println("Main starts..");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num...");
		int a = s.nextInt();
		System.out.println("Enter denom...");
		int b = s.nextInt();
		while(true)
		{
			try
			{
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException rv)
			{
				System.out.println("Denominator is invalid");
				System.out.println("re-enter the ddenominator...");
				b = s.nextInt();
			}
		}
		System.out.println("main ends....");
	}
}
