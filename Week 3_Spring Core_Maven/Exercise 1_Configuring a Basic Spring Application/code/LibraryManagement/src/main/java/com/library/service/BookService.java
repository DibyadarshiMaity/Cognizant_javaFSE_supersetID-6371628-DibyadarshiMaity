package com.library.service;
import com.library.repository.*;
import java.util.*;

public class BookService {
    private BookRepository ob;

    public BookService(BookRepository obj) {
        this.ob = obj;
    }

    public void addBook(String bookName) {
        System.out.println("Service: Adding book - " + bookName);
        ob.save(bookName);
    }

    public void listBooks() {
        ArrayList<String> books = ob.getall();
        System.out.println("Service: Listing all books:");
        for (String b : books) {
            System.out.println(" - " + b);
        }
    }
}

