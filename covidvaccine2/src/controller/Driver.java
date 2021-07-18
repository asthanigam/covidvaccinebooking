package controller;
import model.*;
import services.*;

public class Driver {
    public static void main(String[] args) {
    CapacityService capacityService = new CapacityService();
    UserService userService = new UserService();
    CentreService centreService = new CentreService();

        userService.saveUser(new User("u1","astha",23,"up","kanpur"));
        centreService.saveCentre(new Centre("c1","up","kanpur"));
        capacityService.saveCapacity(new Capacity(50,"1","c1"));
    BookService bookingservice = new BookService();
    bookingservice.listCentre("kanpur","1");
    bookingservice.startBooking("c1", "1","u1");
    bookingservice.listBooking("c1","1");
    bookingservice.cancelBooking("c1",1,"u1");
}
}