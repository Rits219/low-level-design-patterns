package com.shrayansh.behavioural.iteratorDesignPattern;

import com.shrayansh.behavioural.iteratorDesignPattern.aggregate.Aggregate;
import com.shrayansh.behavioural.iteratorDesignPattern.iterator.Iterator;

import java.util.List;

public class Library implements Aggregate {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(bookList);
    }
}
