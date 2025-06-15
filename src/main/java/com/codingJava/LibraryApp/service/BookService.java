package com.codingJava.LibraryApp.service;

import com.codingJava.LibraryApp.entity.Book;
import com.codingJava.LibraryApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBookByName(String bookName) {
       Book bookFound =  bookRepository.findBookByTitle(bookName);
       return bookFound;
    }

    public List<Book> getAllBooks() {
       List<Book> books =  bookRepository.findAll();
       return books;
    }


    public Book updateBook(Integer id, Book book){
        Book bookFound = bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        bookFound.setTitle(book.getTitle());
        bookFound.setAuthor(book.getAuthor());
        bookFound.setGenre(book.getGenre());
        return bookRepository.save(bookFound);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }


}
