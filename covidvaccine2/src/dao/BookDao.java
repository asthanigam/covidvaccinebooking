package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Book;
import services.BookService;

public class BookDao {
    private static HashMap<Integer,Book> bookings = new HashMap<Integer,Book>();
    private static int index = 0;

    public void saveBooking(Book book) {
        bookings.put(index++, book); 
        
    }

    public List<Book> getAllBookings() {
        return  new ArrayList<Book>(bookings.values());
    }

}
