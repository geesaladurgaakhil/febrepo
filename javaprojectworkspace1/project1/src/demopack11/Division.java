package demopack11;
import java.util.Scanner;
public class Division 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  int num...");
		int num = scan.nextInt();
		System.out.println("enter  int deno...");
		int deno = scan.nextInt();
		int result=num/deno;
		System.out.println(result);
	}

}
