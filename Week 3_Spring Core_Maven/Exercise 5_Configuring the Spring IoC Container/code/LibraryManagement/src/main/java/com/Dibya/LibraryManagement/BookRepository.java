package com.Dibya.LibraryManagement;
import java.util.ArrayList;
public class BookRepository 
{
    private ArrayList<String> b = new ArrayList<>();

    public void save(String name) 
    {
        b.add(name);
        System.out.println("BookRepository: Saved - " + name);
    }

    public ArrayList<String> getall()
    {
        return b;
    }
}

