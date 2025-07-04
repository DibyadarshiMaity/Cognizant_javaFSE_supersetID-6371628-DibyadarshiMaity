package com.library.repository;
import java.util.*;

public class BookRepository {
    private ArrayList<String> books = new ArrayList<>();

    public void save(String bookName) {
        books.add(bookName);
        System.out.println("Repository:Book saved :- " + bookName);
    }

    public ArrayList<String> getall() {
        return books;
    }
}

