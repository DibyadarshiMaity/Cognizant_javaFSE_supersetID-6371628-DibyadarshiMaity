package com.Dibya.LibraryManagement;
import java.util.*;
public class BookService {
    private String name;
    private BookRepository ob;
    public BookService(String n) {
        this.name = n;
    }
    public void setBookRepository(BookRepository b) {
        this.ob = b;
    }

    public void add(String title) {
        System.out.println("[" + name + "] BookService: Adding book - " + title);
        ob.save(title);
    }

    public void show() {
        ArrayList<String> books = ob.getall();
        System.out.println("[" + name + "] BookService: All books:");
        for (String book : books) {
            System.out.println(" - " + book);
        }
    }
}

