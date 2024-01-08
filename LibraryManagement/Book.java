//wap for below requirements
//a.create an interface library
//library functionality is addBook() with an argument if book datatype
//create another functionality called displayBookDetails() based on the author name,consider
//author name as String argument
//create an implementation class called hyderabad library which implements library.
//implmentation class will declare private static ArrayList as a global variable. addBook functionaity
//should add the book to the ArrayList Object,displayBook should access ArrayList Object to retrieve
//the particular book based on the given authorName
//before interface and implementation class is created,first create book class,book characteristics are 
//title,authorname,genre encapsulate these properties  .create a constructor to initialize these properties
//override toString method to display each and every bookDetails
//create a getter and setter for each and every property
//create a main class with main method .create a ScannerObject to read book properties during runtime
//create implementation class object to add minimum two books and to display it.
//if the given author is not available throw an exception author not found exception
package day4;

public class Book {
   private String title;
   private String authorName;
   private String genre;
   private int bookId;
public Book(String title, String authorName, String genre, int bookId) {
	super();
	this.title = title;
	this.authorName = authorName;
	this.genre = genre;
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
@Override
public String toString() {
	return "Book [title=" + title + ", authorName=" + authorName + ", genre=" + genre + ", bookId=" + bookId + "]";
}


   
   
}
