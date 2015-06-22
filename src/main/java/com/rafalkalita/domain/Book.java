package com.rafalkalita.domain;

/**
 * Book domain object.
 */
public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book with a title=" + title + '\n';
    }
}
