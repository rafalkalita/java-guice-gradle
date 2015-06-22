package com.rafalkalita.books;

import com.rafalkalita.domain.Book;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A stub for bookService
 */
@Singleton
public class StubBookService implements BookService {
    @Override
    public List<Book> getBooks(long userId) {

        if (userId == 5L) {
            Book book1 = new Book("Effective Java");
            Book book2 = new Book("Well Grounded Java Developer");
            Book book3 = new Book("Clean Code");
            return Arrays.asList(new Book[]{book1, book2, book3});

        } else if (userId == 2L) {
            Book book1 = new Book("Refactoring");
            return Arrays.asList(new Book[]{book1});

        }
        return new ArrayList<>();
    }
}
