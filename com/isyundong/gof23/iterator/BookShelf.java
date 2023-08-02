package com.isyundong.gof23.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private List<Book> books;

    private int last = 0;

    public BookShelf(int defaultSize) {
        this.books = new ArrayList<>(defaultSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last += 1;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
