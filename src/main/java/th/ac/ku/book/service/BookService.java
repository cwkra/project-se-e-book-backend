package th.ac.ku.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.book.model.Book;
import th.ac.ku.book.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book create(Book book) {
        Book record = bookRepository.save(book);
        return record;
    }

    public Book getBookById(Integer id) {
        return bookRepository.findById(id).get();
    }

    public Book update(Book requestBody) {
        Integer id = requestBody.getId();
        Book record = bookRepository.findById(id).get();
        record.setName(record.getName());
        record.setPrice(record.getPrice());
        record.setCategory(record.getCategory());
        record.setAuthor(record.getAuthor());

        record = bookRepository.save(record);
        return record;
    }

    public Book delete(Integer id) {
        Book record = bookRepository.findById(id).get();
        bookRepository.deleteById(id);
        return record;
    }

    public boolean isBookAvailable(String name) {
        return bookRepository.findByName(name) == null;
    }

    public Book getBookByName(String name) {
        return bookRepository.findByName(name);
    }

    public List<Book> getBookByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    public List<Book> getBookByAuthor(String category) {
        return bookRepository.findByCategory(category);
    }
}
