package com.rafalkalita.books;

import com.rafalkalita.domain.Book;

import java.util.List;

/**
 * An interface for books management
 */
public interface BookService {
    List<Book> getBooks(long userId);
}
