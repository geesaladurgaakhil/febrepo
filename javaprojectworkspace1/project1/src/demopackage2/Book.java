package demopackage2;

public class Book 
{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public boolean equals (Object o1)
	{
		Book bObj = (Book)o1;
		return(this.price == bObj.price);
	}
	/*public void bookInfo()
	{
		System.out.println(this.title);
		System.out.println(this.author);
		System.out.println(this.price);
	}*/
}
