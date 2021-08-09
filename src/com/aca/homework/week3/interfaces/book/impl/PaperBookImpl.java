package com.aca.homework.week3.interfaces.book.impl;

import com.aca.homework.week3.interfaces.book.PaperBook;

public class PaperBookImpl implements PaperBook {

    private final int numberOfPages;
    private final String author;
    private final String genre;

    public PaperBookImpl(final int numberOfPages, final String author, final String genre) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void open() {
        System.out.println("Paper Book opened");

    }

    @Override
    public void close() {
        System.out.println("Paper Book closed");

    }

    @Override
    public void browsePages() {
        System.out.println("Browsing paper Book");

    }
}
