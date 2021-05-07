package com.asylzhan.spring.repo;

import com.asylzhan.spring.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    List<Book> findAllByNameOrAuthor(String name, String author);

    Book findById(long id);

    List<Book> getAllByUserId(Long id);

    List<Book> getAllByLibraryId(Long id);
}
