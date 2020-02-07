package demopack1;

public class Librarian 
{
	public static void main(String[] args)
	{
		BookDAO dao =BookDTO.bookdao();
		dao.insertBook(1,new Book("sachin","raja","biography"));
		dao.insertBook(2, new Book("2States","chetan","Romance"));
	}
	

}
