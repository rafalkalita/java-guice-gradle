package com.rafalkalita;

import com.google.inject.AbstractModule;
import com.rafalkalita.books.BookService;
import com.rafalkalita.books.StubBookService;
import com.rafalkalita.users.StubUsersService;
import com.rafalkalita.users.UserService;

/**
 * Guice configuration binding.
 */
public class LibraryModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(BookService.class).to(StubBookService.class);
        bind(UserService.class).to(StubUsersService.class);
    }
}