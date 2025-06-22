package com.codingJava.LibraryApp.controller;

import com.codingJava.LibraryApp.entity.Book;

import com.codingJava.LibraryApp.exception.ResourceNotFoundException;
import com.codingJava.LibraryApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/name/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String bookName){
        Book bookFound = bookService.getBookByName(bookName);

        return ResponseEntity.ok(bookFound);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Integer Id){
        Book bookFound = bookService.getBookById(Id);

        return ResponseEntity.ok(bookFound);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        if (books == null || books.isEmpty()) {
            throw new ResourceNotFoundException(
                    "No books found in the library.",
                    "The library database currently has no book records to display."
            );
        }
        return ResponseEntity.ok(books);
    }




    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.addBook(book);
        return  ResponseEntity.ok(newBook);
    }


    @PutMapping("/update/{bookId}")
    public ResponseEntity<Book> updateBook(@PathVariable("bookId") Integer id,@RequestBody Book book){
        Book updatedBook = bookService.updateBook(id,book);
        return  ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping ("/delete/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer id){
        bookService.deleteBook(id);
        return  ResponseEntity.ok("Book deleted");
    }


}
