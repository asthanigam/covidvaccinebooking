package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dao.BookDao;
import dao.UserDao;
import model.*;
import services.*;

public class BookService {
    private BookDao             bookDao        = new BookDao();
    List<User>                  users;
    List<Centre>                centres;
    List<Capacity>              capacities;
    List<Book>  bookings;

    private Map<String, String> result;
    private UserService         userService    = new UserService();
    private CapacityService     capaciyService = new CapacityService();
    private CentreService       centreService  = new CentreService();

    public BookService() {
        this.users = userService.getAllUsers();
        this.centres = centreService.getAllCentres();
        this.capacities = capaciyService.getAllCapacities();
        this.result = new HashMap<>();
    }

    public void startBooking(String centreId, String day, String userId) {
        if (centres.size() == 0 || capacities.size() == 0)
            System.out.println("No centre or slot available");
        for (int i = 0; i < capacities.size(); i++) {
            if (capacities.get(i).getCentreId().equals(centreId) && capacities.get(i).getDay().equals(day)
                    && capacities.get(i).getCapacity() > 0) {
                bookDao.saveBooking(new Book(23, userId, centreId, day));
                bookings.add(new Book(1, userId, centreId, day));
                capacities.get(i).setCapacity(capacities.get(i).getCapacity() - 1);
                if (capacities.get(i).getCapacity() == 0) {
                    capacities.remove(i);
                }
                break;
            }

        }
    }

    public void listCentre(String district, String day) {
        if (centres.size() == 0 || capacities.size() == 0)
            System.out.println("No centre or slot available");
        String centreid = "";
        for (int i = 0; i < centres.size(); i++) {
            if (centres.get(i).getDistrict().equals(district)) {
                centreid = centres.get(i).getId();
                for (int j = 0; j < capacities.size(); j++) {
                    if (capacities.get(i).getCentreId().equals(centreid) && capacities.get(i).getCapacity() > 0) {
                        System.out.print("centre id " + centreid);
                    }

                }
            }
        }
    }

    public void listBooking(String centreId, String day) {
        int flag = 0;
        for (int i = 0; i < centres.size(); i++) {
            if (centres.get(i).equals(centreId)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("no bookings");
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getCentreId().equals(centreId) && bookings.get(i).getDay().equals(day)) {
                System.out.print("booking id" + bookings.get(i).getBookingId());
            }
        }

    }

    public void cancelBooking(String centreId, int bookingId, String userId) {
        {
            for(int i = 0;i< bookings.size();i++)
            {
                if (bookings.get(i).getBookingId() == bookingId && bookings.get(i).getCentreId().equals(centreId) && 
                        bookings.get(i).getUserId().equals(userId))
                {
                    System.out.print("cancelling booking for booking id" + bookingId);
                    bookings.remove(i);
                }
            }
        }

    }
}