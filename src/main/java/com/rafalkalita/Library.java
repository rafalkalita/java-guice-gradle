package com.rafalkalita;


import com.rafalkalita.books.BookService;
import com.rafalkalita.domain.Book;
import com.rafalkalita.users.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

/**
 * Manages books :)
 */
@Singleton
public class Library {

    private UserService userService;
    private BookService bookService;

    @Inject
    public Library(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    public List<Book> getBookList(String username) {
        long userId = userService.getId(username);
        return bookService.getBooks(userId);
    }
}
