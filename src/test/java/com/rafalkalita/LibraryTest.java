package com.rafalkalita;

import com.rafalkalita.books.BookService;
import com.rafalkalita.domain.Book;
import com.rafalkalita.users.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;


@RunWith(MockitoJUnitRunner.class)
public class LibraryTest {

    public static final String USERNAME = "username";
    public static final long USERNAME_ID = 5L;

    @InjectMocks
    private Library library;

    @Mock
    private UserService userService;

    @Mock
    private BookService bookService;

    @Test
    public void shouldRetrieveBookList() {

        // given
        Book book1 = new Book("Effective Java");
        Book book2 = new Book("Well Grounded Java Developer");
        Book book3 = new Book("Clean Code");
        List<Book> expectedBooks = Arrays.asList(new Book[]{book1, book2, book3});

        given(userService.getId(USERNAME)).willReturn(USERNAME_ID);
        given(bookService.getBooks(USERNAME_ID)).willReturn(expectedBooks);

        //when
        List<Book> books = library.getBookList(USERNAME);

        // then
        assertEquals(expectedBooks.get(0).getTitle(), books.get(0).getTitle());
        assertEquals(expectedBooks.get(1).getTitle(), books.get(1).getTitle());
        assertEquals(expectedBooks.get(2).getTitle(), books.get(2).getTitle());

    }
}