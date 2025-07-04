package com.library.LibraryManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.*;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService obj=(BookService)context.getBean("bookService");
    	obj.addBook("HarryPotter");
    	obj.addBook("Prince Of Narnia");
    	obj.addBook("Sherlock Holmes");
    	obj.listBooks();
    }
}
