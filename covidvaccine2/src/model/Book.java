package model;

//import java.util.List;

//import model.Capacity;
//import model.Centre;
//import model.User;
//import services.UserService;
//import services.CentreService;
//import services.CapacityService;

public class Book {
    private int bookingId;
    private String userId;
    private String centreId;
    private String capacity;
    private String day;
    private String status;
//    private List<Centre> centres;
//    private List<User> users;
//    private List<Capacity> capacities;
//    private CapacityService capacityService = new CapacityService();
//    private CentreService centreService = new CentreService();
//    private UserService userService = new UserService();
    public Book(int bookingId,String userId,String centreId, String day)
    {
        this.bookingId = bookingId;
        this.userId = userId;
        this.centreId = centreId;
        this.day = day;
//        this.setCapacities(capacityService.());
//        this.setUsers(userService.getUsers());
//        this.setCabs(cabService.getCabs());   
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

//    public List<User> getUsers() {
//        return users;
//    }
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getCentreId() {
        return centreId;
    }
    public void setCentreId(String centreId) {
        this.centreId = centreId;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
}
