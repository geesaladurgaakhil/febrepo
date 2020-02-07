package demopack11;
import java.util.Scanner;
public class Sample 
{
	public static void main(String[] args)
	{
		Scanner sv = new Scanner(System.in);
		System.out.println("Enter string data");
		String data1 = sv.next();
		System.out.println("Enter int data");
		int data2 = sv.nextInt();
		System.out.println("Enter double data");
		double data3 = sv.nextDouble();
		System.out.println("Enter datas are");
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}

}
