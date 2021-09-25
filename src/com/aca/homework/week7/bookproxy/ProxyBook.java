package com.aca.homework.week7.bookproxy;

import com.aca.homework.week7.bookproxy.exceptions.BookAlreadyLoadedException;
import com.aca.homework.week7.bookproxy.exceptions.BookNotLoadedException;

public class ProxyBook extends Book {
    private final Book book;
    private boolean isLoaded;

    public ProxyBook(final Book book) {
        this.book = book;
    }

    public boolean isIsLoaded() {
        return this.isLoaded;
    }

    public void load() {
        if (this.isLoaded) {
            throw new BookAlreadyLoadedException("Book is already loaded");
        }
        this.isLoaded = true;
    }

    @Override
    public String getTitle() {
        if (!isLoaded) {
            throw new BookNotLoadedException("Book hasn't been loaded yet");
        }
        load();
        return this.book.getTitle();
    }

    @Override
    public String getAuthor() {
        if (!isLoaded) {
            throw new BookNotLoadedException("Book hasn't been loaded yet");
        }
        load();
        return this.book.getAuthor();
    }
}
