package org.example;

import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Test the service
        bookService.issueBook("The Great Gatsby");
    }
}