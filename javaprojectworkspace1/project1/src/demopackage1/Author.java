package demopackage1;

public class Author 
{
	Book b;
	Pen p;
	public Author(Book b,Pen p)
	{
		this.b=b;
		this.p=p;
	}
	public void story()
	{
		b.bookInfo();
		b.openBook();
		p.write();
		b.turnPages();
		p.write();
		b.closeBook();
	}
}
