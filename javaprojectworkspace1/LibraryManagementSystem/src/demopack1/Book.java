package demopack1;

public class Book 
{
	private String bookTitle;
	private String bookAuthor;
	private String bookType;
	
	public Book(String bookTitle, String bookAuthor, String bookType) 
	{
	
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
	}

	@Override
	public String toString() 
	{
		return this.bookTitle + " is a "+this.bookType+" book written by "+this.bookAuthor;
	}
	public String getBookTitle()
	{
		return this.bookTitle;
	}
	public String getBookAuthor()
	{
		return this.bookAuthor;
	}
	public String getBookType()
	{
		return this.bookType;
	}
	

}
