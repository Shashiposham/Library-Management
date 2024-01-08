package day4;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class HyderabadLibrary implements Library{
	  Scanner sc=new Scanner(System.in);
	   
	private ArrayList<Book> a=new ArrayList<Book>();

	public void addBook(Book b) {
		a.add(b);
	}

	public void displayBookDetails(String author)  {
		
		ListIterator<Book> l = a.listIterator();
		int count=0;
		while(l.hasNext()) {
			Book a = l.next();
			if(a.getAuthorName().equals(author)) {
				System.out.println(a.toString());
				count++;
				break;
			}
		}
		if(count==0) {
			throw new AuthorNotFound();
		}
	}

	@Override
	public void removeBook(int bookid) {
		ListIterator<Book> l = a.listIterator();
		int count=0;
		while(l.hasNext()) {
			Book a = l.next();
			if(a.getBookId()==bookid) {
				l.remove();
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("enter valid id");
		}
		else {
			System.out.println("data removed succesfully");
		}
		for(Book b:a) {
			System.out.println(b.getAuthorName());
		}
	}
    
	@Override
	public void updateBook(int bookid) {
		ListIterator<Book> l = a.listIterator();
		int count=0;
		while(l.hasNext()) {
			Book a = l.next();
			if(a.getBookId()==bookid) {
				count++;
				int s=a.getBookId();
				String authorName = a.getAuthorName();
				String genre = a.getGenre();
				 String title = a.getTitle();
				System.out.println("enter choice by characters");
				switch (sc.next().charAt(0)) {
				case 'a':
					System.out.println("enter new book id");
					a.setBookId(sc.nextInt());
					System.out.println("book id "+s+" modified to"+a.getBookId());
					break;
				case 'b':
					System.out.println("modify authorName");
					a.setAuthorName(sc.next());
					System.out.println("book  authorName is"+authorName+" modified t0"+a.getAuthorName());
                    break;
				case 'c':
					System.out.println("enter new title");
					a.setTitle(sc.next());
					System.out.println("book genre is"+genre+" modified to"+a.getGenre());
					break;
				case 'd':
					System.out.println("enter modified genre");
					a.setGenre(sc.next());
					System.out.println("book title is "+title+" modified t0"+a.getTitle());
					break;
				default:
					break;
				}
						break;
			}
		}
	}

	@Override
	public void summary() {
		for(Book z:a) {
			System.out.println(z.getBookId());
			System.out.println(z.getAuthorName());
			System.out.println(z.getTitle());
			System.out.println(z.getGenre());
		}
	}
	public void summary(int id) {
		for(Book z:a) {
			if(id==z.getBookId())
			{
			System.out.println(z.getBookId());
			System.out.println(z.getAuthorName());
			System.out.println(z.getTitle());
			System.out.println(z.getGenre());
			}
		}
	}
}