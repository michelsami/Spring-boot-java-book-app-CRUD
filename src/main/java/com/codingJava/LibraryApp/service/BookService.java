package com.codingJava.LibraryApp.service;

import com.codingJava.LibraryApp.entity.Book;
import com.codingJava.LibraryApp.exception.ResourceNotFoundException;
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
        Book bookFound = bookRepository.findBookByTitle(bookName);
        if (bookFound == null) {
            throw new ResourceNotFoundException(
                    "Book not found with name: " + bookName,
                    "The book you're searching for may have been deleted or never existed."
            );
        }
        return bookFound;
    }
    public Book getBookById(Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Book not found with Id: " + id,
                "The book you're searching for may have been deleted or never existed."
        ));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    public Book updateBook(Integer id, Book book){
        Book bookFound = bookRepository.findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException(
                                "Book with id "+ id +" not found",
                                "The book you're searching for may have been deleted or never existed."));
        bookFound.setTitle(book.getTitle());
        bookFound.setAuthor(book.getAuthor());
        bookFound.setGenre(book.getGenre());
        return bookRepository.save(bookFound);
    }

    public void deleteBook(Integer id) {
        if (!bookRepository.existsById(id)) {
            throw new ResourceNotFoundException(
                    "Book not found with ID: " + id,
                    "Cannot delete. The book with this ID does not exist."
            );
        }
        bookRepository.deleteById(id);
    }


}
