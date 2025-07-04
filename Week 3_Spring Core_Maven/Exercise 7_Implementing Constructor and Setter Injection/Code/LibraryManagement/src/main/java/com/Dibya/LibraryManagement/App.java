package com.Dibya.LibraryManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // Get BookService bean
        BookService obj = (BookService)context.getBean("bookService");
        // Test the configuration
        obj.add("HISTORY");
        obj.add("GEOGRAPHY");
        obj.show();
    }
}
