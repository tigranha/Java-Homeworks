package com.aca.homework.week7.bookproxy.exceptions;

public class BookNotLoadedException extends RuntimeException {
    public BookNotLoadedException(final String message) {
        super(message);
    }
}
