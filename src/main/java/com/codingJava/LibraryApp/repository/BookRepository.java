package com.codingJava.LibraryApp.repository;

import com.codingJava.LibraryApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}
