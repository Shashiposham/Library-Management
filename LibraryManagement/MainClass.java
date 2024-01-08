//modify main method in the below manner press 1.to add book press2.to retrieve a particular book press3.to remove parti book;
//press4.to update particular book press5.to view book summary
//sub requirements when 1 is pressed enter book title ,enter book authorname,enter bookgenre,enter bookid.
//                 when 2 is pressed enter authorName to retrieve the book details 
//                 when 3 is pressed enter bookid to remove the book.
//                 when 4 is pressed enter bookid to update the book.
//    press a to update bookId, press b to update book  authorName, press c to update bookIitle, press d to update book genre 
//when a is pressed enter new bookid and after updation in update method it should print for ex:bookid 1150 is updated to1780
//in the same manner replicate b,c,d is pressed
//finally after one transaction press 1 to display main menu.press 2 to exit.
package day4;

import java.util.Scanner;

public class MainClass {
   public static void main(String[] args) throws Exception {
	   Scanner s=new Scanner(System.in);
	HyderabadLibrary h=new HyderabadLibrary();
//	System.out.println("enter authorName");
//	h.displayBookDetails(s.nextLine());
	//h.summary();
	//h.updateBook(s.nextInt());
	int i=1;
	
	while(i==1) {
		System.out.println("enter choice");
		System.out.println("enter 1 to add book");
		System.out.println("enter 2 to fetch book by author");
		System.out.println("");
		switch (s.nextInt()) {
		case 1:
			System.out.println("add a new book");
			System.out.println("enter book title");
			String title = s.next();
			System.out.println("enter book author");
			String author = s.next();
			System.out.println("enter book genre");
			String genre = s.next();
			System.out.println("enter bookId");
			int bookId = s.nextInt();
			h.addBook(new Book(title,author,genre,bookId));
		
			break;
		case 2:
			System.out.println("enter author name");
			h.displayBookDetails(s.next());
		    break;
		case 3:
			System.out.println("enter book id to remove");
			h.removeBook(s.nextInt());
			break;
		case 4:
			System.out.println("enter book id to update");
			h.updateBook(s.nextInt());
			break;
		default:
			System.out.println("enter valid choice");
			break;
		}
		System.out.println("press 0 or 1");
		i=s.nextInt();
	}
	
}
}
