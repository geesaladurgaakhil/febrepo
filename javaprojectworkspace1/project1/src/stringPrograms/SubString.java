package stringPrograms;

public class SubString 
{
	public static void main(String[] args)
	{
		String s = "developer";
		System.out.println(s.substring(3));//output is- eloper..   // for substring method input is integer..and we are providing it as argument..and output is String...
		                                      // output is a part of the string.. if we give 3 as an argument then output will be printed from index number 3 only.....3 is inclusive..
		
		System.out.println(s.substring(3, 7));//output is - elop  // two argument substring method gives the output with in the give arguments here first argument is inclusive and Second argument is Exclusive...
		
	}

}


