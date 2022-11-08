package th.ac.ku.book.testingCucumber;

import io.cucumber.java.en.Given;
import th.ac.ku.book.model.Book;

import java.util.ArrayList;

public class AddStepdefs{

    private Book  book;
    private ArrayList books;



    @Given("the e_book_store is ready to service customer")
    public void the_e_book_store_is_ready_to_service_customer(){
        books = new ArrayList();
        book = new Book();
    }


}
