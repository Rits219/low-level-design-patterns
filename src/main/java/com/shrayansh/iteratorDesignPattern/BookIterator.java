package com.shrayansh.iteratorDesignPattern;

import com.shrayansh.iteratorDesignPattern.iterator.Iterator;

import java.util.List;

public class BookIterator implements Iterator<Book> {
    private List<Book> bookList;
    private int index;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Book next() {
        if (this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
