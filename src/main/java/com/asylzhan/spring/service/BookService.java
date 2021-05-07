package com.asylzhan.spring.service;

import com.asylzhan.spring.entity.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);
    Book update(Book book);
    void delete(Long id);
    List<Book> getAll();
    List<Book> findAllByNameOrAuthorAnd(String name, String author);
    List<Book> findAllByUserId(Long id);
    List<Book> findAllByLibrary(Long id);

    Book findById(long id);

    Book assignBookToUser(Long bookId, Long userId);

    Book assignBookToLibrary(Long bookId, Long libraryId);
}
