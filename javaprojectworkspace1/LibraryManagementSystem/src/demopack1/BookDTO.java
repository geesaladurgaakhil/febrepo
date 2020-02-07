package demopack1;

public class BookDTO 
{
	public static BookDAO bookdao()
	{
		BookDAO	dao = new BookDAOImplement();
		return dao;
	}

}
