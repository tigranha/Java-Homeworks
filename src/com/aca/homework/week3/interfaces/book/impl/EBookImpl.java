package com.aca.homework.week3.interfaces.book.impl;

import com.aca.homework.week3.interfaces.book.EBook;

public class EBookImpl implements EBook {

    private final int numberOfPages;
    private final String author;
    private final String genre;
    private final double sizeMB;

    public EBookImpl(final int numberOfPages, final String author, final String genre, final double sizeMB) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.genre = genre;
        this.sizeMB = sizeMB;
    }

    @Override
    public void open() {
        System.out.println("eBook opened");
    }

    @Override
    public void close() {
        System.out.println("eBook closed");

    }

    @Override
    public void browsePages() {
        System.out.println("Browsing eBook");

    }
}
