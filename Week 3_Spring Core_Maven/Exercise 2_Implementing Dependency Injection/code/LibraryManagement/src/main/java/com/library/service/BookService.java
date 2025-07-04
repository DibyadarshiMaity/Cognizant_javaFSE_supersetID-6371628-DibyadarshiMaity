package com.library.service;
import com.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository b;

    // 🔧 Setter for dependency injection
    public void setBookRepository(BookRepository ob) {
        this.b = ob;
    }

    public void addBook(String name) {
        System.out.println("Service: Adding book - " + name);
        b.save(name);
    }

    public void listBooks() {
        List<String> books = b.getall();
        System.out.println("Service: Listing all books:");
        for (String book : books) {
            System.out.println(" - " + book);
        }
    }
}


