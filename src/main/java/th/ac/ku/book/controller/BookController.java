package th.ac.ku.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.book.model.Book;
import th.ac.ku.book.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    @PutMapping
    public Book update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public Book delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @GetMapping("/name/{name}")
    public Book getBookByName(@PathVariable String name) {
        return bookService.getBookByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Book> getBookByCategory(@PathVariable String category) {
        return bookService.getBookByCategory(category);
    }

    @GetMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author) {
        return bookService.getBookByAuthor(author);
    }
}
