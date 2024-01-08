//wap for below requirements
//a.create an interface library
//library functionality is addBook() with an argument of book datatype
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
//within interface add another functionality remove Book based on the book id;add another property to book i.e,bookid
//create another functionality in interface update book details based on the book id.
//create another functionality in interface book summary while will display only book id,boo title and author of each and
//every book present in the library.
//modify main method in the below manner press 1.to add book press2.to retrieve a particular book press3.to remove parti book;
//press4.to update particular book press5.to view book summary
//sub requirements when 1 is pressed enter book title ,enter book authorname,enter bookgenre,enter bookid.
//                 when 2 is pressed enter authorName to retrieve the book details 
//                 when 3 is pressed enter bookid to remove the book.
//                 when 4 is pressed enter bookid to update the book.
//    press a to update bookId, press b to book authorName, press c to update bookIitle, press d to update book genre 
//when a is pressed enter new bookid and after updation in update method it should print for ex:bookid 1150 is updated to1780
//in the same manner replicate b,c,d is pressed
//finally after one transaction press 1 to display main menu.press 2 to exit.
package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public interface Library {
	  void addBook(Book b);
	  void displayBookDetails(String author);
	  void removeBook(int bookid);
	  void updateBook(int bookid);
	  void summary();
}

	

	
	


