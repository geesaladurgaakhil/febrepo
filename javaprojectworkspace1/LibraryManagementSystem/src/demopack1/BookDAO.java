package demopack1;

public interface BookDAO 
{
	void insertBook(Integer refId,Book b);
	void searchBook(String bookAuthor);
	void removeBook(String bookTitle);
}

