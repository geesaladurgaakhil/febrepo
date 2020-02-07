package demopackage1;

public class Book 
{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price)
	{
		this.title = title;
		this.author= author;
		this.price = price;
	}
	public void bookInfo()
	{
		System.out.println(this.title+" a book by "+this.author+" of costs "+this.price);
		System.out.println(this.author);
		System.out.println(this.price);
	}
	public void openBook() 
	{
		System.out.println("open the book");
	}
	public void turnPages()
	{
		System.out.println("turn pages");
	}
	public void closeBook()
	{
		System.out.println("close the book");
	}
}
