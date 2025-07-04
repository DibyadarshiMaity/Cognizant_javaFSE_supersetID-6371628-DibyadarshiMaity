package com.Dibya.LibraryManagement;
import java.util.*;
public class BookService 
{
	 private BookRepository obj;
	 public void setBookRepository(BookRepository b) 
	 {
		 this.obj = b;
	 }

		public void addBook(String title) {
	        System.out.println("BookService: Adding book - " + title);
	        obj.save(title);
	    }

	    public void show() {
	        ArrayList<String> books = obj.getall();
	        System.out.println("BookService: All books:");
	        for (String book : books) {
	            System.out.println(" - " + book);
	        }
	    }

}
