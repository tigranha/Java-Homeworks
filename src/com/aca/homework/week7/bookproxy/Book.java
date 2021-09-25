package com.aca.homework.week7.bookproxy;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + this.title + '\'' +
                ", author='" + this.author + '\'' +
                '}';
    }
}
