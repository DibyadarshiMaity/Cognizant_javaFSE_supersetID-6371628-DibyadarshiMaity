package com.Dibya.LibraryManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService obj = (BookService)context.getBean("bookService");
        obj.addBook("HISTORY");
        obj.addBook("GEOGRAPHY");
        obj.show();
    }
}
