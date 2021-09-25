package com.aca.homework.week7.bookproxy.exceptions;

public class BookAlreadyLoadedException extends RuntimeException {
    public BookAlreadyLoadedException(final String message) {
        super(message);
    }
}