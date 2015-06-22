package com.rafalkalita;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rafalkalita.books.BookService;
import com.rafalkalita.domain.Book;
import com.rafalkalita.users.UserService;

import java.util.List;

/**
 * Main class that uses a Library to display users books.
 */
public class Application {

    private Library library;

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new LibraryModule());
        UserService userService = injector.getInstance(UserService.class);
        BookService bookService = injector.getInstance(BookService.class);

        Library library = new Library(userService, bookService);

        showBooks(library, "John");
        showBooks(library, "Maria");
        showBooks(library, "Anna");
    }

    private static void showBooks(Library library, String username) {
        List<Book> johnsBooks = library.getBookList(username);

        System.out.println("\n" + username + " holds the following books:");

        for (Book book : johnsBooks) {
            System.out.println(book.getTitle());
        }
    }
}
