package model;

public class Capacity {
    private int capacity;
    private String day;
    private String centreId;
    public Capacity(int capacity, String day, String centreId)
    {
        this.setCapacity(capacity);
        this.setDay(day);
        this.setCentreId(centreId);
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getCentreId() {
        return centreId;
    }
    public void setCentreId(String centreId) {
        this.centreId = centreId;
    }
   
}
