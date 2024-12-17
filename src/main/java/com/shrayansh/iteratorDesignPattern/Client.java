package com.shrayansh.iteratorDesignPattern;

import com.shrayansh.iteratorDesignPattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1", 100));
        bookList.add(new Book("Book2", 200));
        bookList.add(new Book("Book3", 300));
        bookList.add(new Book("Book4", 400));

        Library library = new Library(bookList);

        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
