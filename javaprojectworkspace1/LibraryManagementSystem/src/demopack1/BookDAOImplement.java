package demopack1;

import java.util.TreeMap;

public class BookDAOImplement implements BookDAO
{
	private static  TreeMap<Integer, Book> mapbooks = new TreeMap<Integer, Book>();
	public void insertBook(Integer refId,Book b)
	{
		mapbooks.put(refId, b);
	}
	public void searchBook(String bookAuthor)
	{
		
	}
	public void removeBook(String bookTitle)
	{
		
	}
		
}


