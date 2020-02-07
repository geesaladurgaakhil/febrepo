package revisionpackage;

public class PatternL 
{
	public static void main(String[] args) 
    {
        //Printing upper half of the pattern
         
        for (int i = 6; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        } 
        //Printing lower half of the pattern
         
        for (int i = 2; i <= 6; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
       
      
    }

}
